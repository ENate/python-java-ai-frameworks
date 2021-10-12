from rest_framework import serializers
from blog.models import Post


class PostSerializer(serializers.ModelSerializer):
    class Meta:
        model = Post  # defines which data to work with
        fields = ("id", "title", "author", "excerpt", "content", "status")
        model = Post
