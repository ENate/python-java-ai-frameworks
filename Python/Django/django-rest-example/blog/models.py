from django.db import models

# Create your models here.
from django.db import models
from django.contrib.auth.models import User
from django.utils import timezone

# Define a model table to serve posts from dbase using REST to react
# Each user will be mapped to a Post.
class Category(models.Model):
    name = models.CharField(max_length=100)

    # Return name as string
    def __str__(self):
        return self.name


# Define Post Model
class Post(models.Model):
    # create model manager - we want to filter data from dbase which are published.
    # Intention is to select on published data only. So as to make sure only data that is published:
    # Run Post objects instead of Objects.all so as to return only published data.
    class PostObjects(models.Manager):
        def get_queryset(self):
            return super().get_queryset().filter(status="published")

    # Will not allow a category to be deleted
    # Define choices to be used and describe posts: draft or published
    options = (("draft", "Draft"), ("published", "Published"))
    category = models.ForeignKey(Category, on_delete=models.PROTECT, default=1)
    title = models.CharField(max_length=250)
    excerpt = models.TextField(null=True)
    content = models.TextField()
    # for urls and identify each post.
    slug = models.SlugField(max_length=250, unique_for_date="published")
    published = models.DateTimeField(default=timezone.now)
    # author with non foreign key
    author = models.ForeignKey(
        User, on_delete=models.CASCADE, related_name="blog_posts"
    )
    status = models.CharField(max_length=10, choices=options, default="published")
    objects = models.Manager()  # default manager
    postobjects = PostObjects()

    # Have data return in the descending order
    class Meta:
        ordering = ("-published",)

    def __str__(self):
        return self.title
