from django.shortcuts import render
from django.views.generic import CreateView
from django.contrib.auth.views import LoginView
class CSOLoginView(LoginView):
  template_name = 'estimation/login.html'

def estimation(request):
  return render(request, 'estimation/estimation.html')

