// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/tensor_bundle.proto

package org.tensorflow.util;

public final class TensorBundleProtos {
  private TensorBundleProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_BundleHeaderProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_BundleHeaderProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_BundleEntryProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_BundleEntryProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n,tensorflow/core/protobuf/tensor_bundle" +
      ".proto\022\ntensorflow\032,tensorflow/core/fram" +
      "ework/tensor_shape.proto\032,tensorflow/cor" +
      "e/framework/tensor_slice.proto\032%tensorfl" +
      "ow/core/framework/types.proto\032(tensorflo" +
      "w/core/framework/versions.proto\"\261\001\n\021Bund" +
      "leHeaderProto\022\022\n\nnum_shards\030\001 \001(\005\022<\n\nend" +
      "ianness\030\002 \001(\0162(.tensorflow.BundleHeaderP" +
      "roto.Endianness\022\'\n\007version\030\003 \001(\0132\026.tenso" +
      "rflow.VersionDef\"!\n\nEndianness\022\n\n\006LITTLE" +
      "\020\000\022\007\n\003BIG\020\001\"\322\001\n\020BundleEntryProto\022#\n\005dtyp" +
      "e\030\001 \001(\0162\024.tensorflow.DataType\022+\n\005shape\030\002" +
      " \001(\0132\034.tensorflow.TensorShapeProto\022\020\n\010sh" +
      "ard_id\030\003 \001(\005\022\016\n\006offset\030\004 \001(\003\022\014\n\004size\030\005 \001" +
      "(\003\022\016\n\006crc32c\030\006 \001(\007\022,\n\006slices\030\007 \003(\0132\034.ten" +
      "sorflow.TensorSliceProtoBl\n\023org.tensorfl" +
      "ow.utilB\022TensorBundleProtosP\001Z<github.co" +
      "m/tensorflow/tensorflow/tensorflow/go/co" +
      "re/protobuf\370\001\001b\006proto3"
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
          org.tensorflow.framework.TensorShapeProtos.getDescriptor(),
          org.tensorflow.framework.TensorSliceProtos.getDescriptor(),
          org.tensorflow.framework.TypesProtos.getDescriptor(),
          org.tensorflow.framework.VersionsProtos.getDescriptor(),
        }, assigner);
    internal_static_tensorflow_BundleHeaderProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tensorflow_BundleHeaderProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_BundleHeaderProto_descriptor,
        new java.lang.String[] { "NumShards", "Endianness", "Version", });
    internal_static_tensorflow_BundleEntryProto_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_tensorflow_BundleEntryProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_BundleEntryProto_descriptor,
        new java.lang.String[] { "Dtype", "Shape", "ShardId", "Offset", "Size", "Crc32C", "Slices", });
    org.tensorflow.framework.TensorShapeProtos.getDescriptor();
    org.tensorflow.framework.TensorSliceProtos.getDescriptor();
    org.tensorflow.framework.TypesProtos.getDescriptor();
    org.tensorflow.framework.VersionsProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
