/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
#include <string>
/* Header for class com_aserbao_aserbaosandroid_functions_how_create_so_useCmake_AserbaoUtils */

#ifndef _Included_com_aserbao_aserbaosandroid_functions_how_create_so_useCmake_AserbaoUtils
#define _Included_com_aserbao_aserbaosandroid_functions_how_create_so_useCmake_AserbaoUtils
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     com_aserbao_aserbaosandroid_functions_how_create_so_useCmake_AserbaoUtils
 * Method:    getSimpleInfo
 * Signature: ()Ljava/lang/String;
 */

JNIEXPORT jstring JNICALL Java_com_aserbao_aserbaosandroid_functions_how_1create_1so_useCmake_AserbaoUtils_getSimpleInfoFromTwo
        (JNIEnv *env, jclass){
    std::string hello = "这是一个来自第二个包的文件信息";
    return env->NewStringUTF(hello.c_str());
};


#ifdef __cplusplus
}
#endif
#endif