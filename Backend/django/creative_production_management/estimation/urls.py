from django.urls import path
from . import views

urlpatterns = [
  # path('', views.CSOLoginView.as_view(), name='login'),
  path('', views.estimation, name='estimation'),
]