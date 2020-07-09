package com.qisi.freemarker;

/**
 * Created by IntelliJ IDEA.
 *
 * @ProjectName: freemarker
 * @ClassName: ThreadLocalTest
 * @Description: java类作用描述
 * @CreateUser: Mr.Hao
 * @CreateDate: 2020/7/6  15:44
 **/

public class ThreadLocalTest {
        //(1)创建线程变量
        public static ThreadLocal<String> threadLocal = new InheritableThreadLocal<>();

        public static void main(String[] args) {
            //(2)设置线程变量
            threadLocal.set("hello world");
            //(3)启动子线程
            final Thread thread = new Thread(new Runnable() {
                public void run() {
                    //(4)子线程输出线程变量的值
                    System.out.println("thread:" + threadLocal.get());
                }
            });
            thread.start();

            //(5)主线程输出线程变量的值
            System.out.println("main:" + threadLocal.get());
        }
    }
//
//    //(1)print方法
//    static void print(String str){
//        //1.1 打印当前线程本地内存中localVariable变量的值
//        System.out.println(str+":"+localVariable.get());
//        //1.2 清除当前线程本地内存中localVariable变量
//        localVariable.remove();
//    }
//
//    //(2)创建ThreadLocal变量
//    static ThreadLocal<String> localVariable = new ThreadLocal<String>();
//
//    public static void main(String[] args) {
//        //(3)创建线程one
//        Thread threadOne = new Thread(new Runnable() {
//            public void run() {
//                //3.1 设置线程one中本地变量localVariable的值
//                localVariable.set("threadOne localVariable");
//                //3.2 调用打印函数
//                print("threadOne");
//                //3.3 打印本地变量值
//                System.out.println("threadOne remove after:"+localVariable.get());
//            }
//        });
//
//        //(4)创建线程two
//        Thread threadTwo = new Thread(new Runnable() {
//            public void run() {
//                //4.1 设置线程two中本地变量localVariable的值
//                localVariable.set("threadTwo localVariable");
//                //4.2 调用打印函数
//                print("threadTwo");
//                //4.3 打印本地变量值
//                System.out.println("threadTwo remove after:"+localVariable.get());
//            }
//        });
//
//        //(5)启动线程
//        threadOne.start();
//        threadTwo.start();
//    }
//}