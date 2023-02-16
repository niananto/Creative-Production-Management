from django.db import models
from django.core.validators import RegexValidator
from django.contrib.auth.models import AbstractBaseUser, UserManager
from django.utils.translation import gettext_lazy as _

class User(models.Model):
  """base user model"""
  name = models.CharField(max_length=50)
  username = models.CharField(
    _('username'),
    max_length=20,
    unique=True,
  )
  phone = models.CharField(
      _('phone number'),
      validators=[RegexValidator(regex=r'^0[0-9]{10}$')],
      max_length=11,
      help_text='e.g. 01712345678',
      unique=True
  )
  email = models.EmailField(blank=True)
  is_active = models.BooleanField(_('active'), default=True)
  created_at = models.DateTimeField(auto_now_add=True)

  objects = UserManager()

  USERNAME_FIELD = 'username'
  EMAIL_FIELD = 'email'
  REQUIRED_FIELDS = ['username']

class CSO(User):
  """cso model"""
  pass

class Designer(User):
  """designer model"""
  salary = models.FloatField()
  category = models.CharField(max_length=1)
