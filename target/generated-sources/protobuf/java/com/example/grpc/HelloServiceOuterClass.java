// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HelloService.proto

package com.example.grpc;

public final class HelloServiceOuterClass {
  private HelloServiceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_grpc_HelloRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_grpc_HelloRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_grpc_HelloResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_grpc_HelloResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022HelloService.proto\022\020com.example.grpc\"3" +
      "\n\014HelloRequest\022\021\n\tfirstName\030\001 \001(\t\022\020\n\010las" +
      "tName\030\002 \001(\t\"!\n\rHelloResponse\022\020\n\010greeting" +
      "\030\001 \001(\t2X\n\014HelloService\022H\n\005hello\022\036.com.ex" +
      "ample.grpc.HelloRequest\032\037.com.example.gr" +
      "pc.HelloResponseB\002P\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_example_grpc_HelloRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_example_grpc_HelloRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_grpc_HelloRequest_descriptor,
        new java.lang.String[] { "FirstName", "LastName", });
    internal_static_com_example_grpc_HelloResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_example_grpc_HelloResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_grpc_HelloResponse_descriptor,
        new java.lang.String[] { "Greeting", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
