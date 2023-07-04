import os
import shutil


def remove_empty_directories(dir_path):
    for subdir, dirs, files in os.walk(dir_path, topdown=False):
        for dir_name in dirs:
            full_dir_path = os.path.join(subdir, dir_name)
            if not os.listdir(full_dir_path):
                print("Removing empty directory: " + full_dir_path)
                os.rmdir(full_dir_path)


def remove(extensions: tuple, dir_path):
    for subdir, dirs, files in os.walk(dir_path):
        if os.path.basename(subdir) == 'target':
            shutil.rmtree(subdir)
        for file in files:
            if not file.endswith(extensions):
                file_path = os.path.join(subdir, file)
                print("Removing " + file_path)
                os.remove(file_path)


if __name__ == '__main__':
    dir_path = "WebApps"
    remove_empty_directories(dir_path)
    remove((".java", "jsp"), dir_path)
