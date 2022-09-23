import gdb
import os

def get_class_file_path(class_path, class_name):
    if not "." in class_name:
        return "%s/%s.class" % (class_path, class_name)
    class_file_path = class_name.replace(".", "/")
    class_dir = class_file_path[0: class_file_path.rindex("/")]
    if not os.path.isdir("%s/%s" % (class_path, class_dir)):
        print("%s/%s is not dir" % (class_path, class_dir))
        os.makedirs("%s/%s" % (class_path, class_dir))
    return "%s/%s.class" % (class_path, class_file_path)

class ClassFilePath(gdb.Function):

    def __init__ (self):
        super (ClassFilePath, self).__init__ ("ClassFilePath")

    def invoke (self, dir_name_value, class_name_value):
        dir_name = dir_name_value.string()
        class_name = class_name_value.string()
        if not os.path.isdir("./%s" % dir_name):
            print("%s is not dir" % dir_name)
            os.mkdir("./%s" % dir_name)
        class_path = "./%s" % dir_name
        return get_class_file_path(class_path, class_name.replace("/", "#"))

ClassFilePath()
