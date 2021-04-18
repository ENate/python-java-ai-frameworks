from django.contrib import admin

# Register your models here.
from . import models

@admin.register(models.Post)
class PostAdmin(admin.ModelAdmin):
    list_displays = ('title', 'id', 'status', 'slug', 'author')
    prepopulated_fields = {'slug': ('title',), }

admin.site.register(models.Category)