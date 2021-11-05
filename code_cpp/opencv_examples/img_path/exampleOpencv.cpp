#include <opencv2/opencv.hpp>

using namespace cv;
int main(int argc, char** argv)
{
    if (argc != 2)
    {
        printf("usage: exampleOpencv.out /img_path \n");
        return -1;
    }
    Mat image;
    image = imread(argv[1], 1);
    if (!image.data)
    {
        printf("No image data \n");
        return -1;
    }
    namedWindow("Our Image", WINDOW_AUTOSIZE);
    imshow("Our Image", image);
    waitKey(0);
    return 0;
}