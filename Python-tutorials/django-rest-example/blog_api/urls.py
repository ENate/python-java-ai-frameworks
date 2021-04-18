from django.urls import path
from .views import PostList, PostDetail

app_name = 'blog_api'

urlpatterns = [
    # shows detailed views
    path('<int:pk>/', PostDetail.as_view(), name='detailcreate'),
    # shows all posts
    path('', PostList.as_view(), name='listcreate')
]