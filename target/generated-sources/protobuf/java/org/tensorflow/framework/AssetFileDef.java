// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/meta_graph.proto

package org.tensorflow.framework;

/**
 * <pre>
 * An asset file def for a single file or a set of sharded files with the same
 * name.
 * </pre>
 *
 * Protobuf type {@code tensorflow.AssetFileDef}
 */
public  final class AssetFileDef extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.AssetFileDef)
    AssetFileDefOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AssetFileDef.newBuilder() to construct.
  private AssetFileDef(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AssetFileDef() {
    filename_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AssetFileDef(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            org.tensorflow.framework.TensorInfo.Builder subBuilder = null;
            if (tensorInfo_ != null) {
              subBuilder = tensorInfo_.toBuilder();
            }
            tensorInfo_ = input.readMessage(org.tensorflow.framework.TensorInfo.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(tensorInfo_);
              tensorInfo_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            filename_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.framework.MetaGraphProtos.internal_static_tensorflow_AssetFileDef_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.framework.MetaGraphProtos.internal_static_tensorflow_AssetFileDef_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.framework.AssetFileDef.class, org.tensorflow.framework.AssetFileDef.Builder.class);
  }

  public static final int TENSOR_INFO_FIELD_NUMBER = 1;
  private org.tensorflow.framework.TensorInfo tensorInfo_;
  /**
   * <pre>
   * The tensor to bind the asset filename to.
   * </pre>
   *
   * <code>.tensorflow.TensorInfo tensor_info = 1;</code>
   */
  public boolean hasTensorInfo() {
    return tensorInfo_ != null;
  }
  /**
   * <pre>
   * The tensor to bind the asset filename to.
   * </pre>
   *
   * <code>.tensorflow.TensorInfo tensor_info = 1;</code>
   */
  public org.tensorflow.framework.TensorInfo getTensorInfo() {
    return tensorInfo_ == null ? org.tensorflow.framework.TensorInfo.getDefaultInstance() : tensorInfo_;
  }
  /**
   * <pre>
   * The tensor to bind the asset filename to.
   * </pre>
   *
   * <code>.tensorflow.TensorInfo tensor_info = 1;</code>
   */
  public org.tensorflow.framework.TensorInfoOrBuilder getTensorInfoOrBuilder() {
    return getTensorInfo();
  }

  public static final int FILENAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object filename_;
  /**
   * <pre>
   * The filename within an assets directory. Note: does not include the path
   * prefix, i.e. directories. For an asset at /tmp/path/vocab.txt, the filename
   * would be "vocab.txt".
   * </pre>
   *
   * <code>string filename = 2;</code>
   */
  public java.lang.String getFilename() {
    java.lang.Object ref = filename_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      filename_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The filename within an assets directory. Note: does not include the path
   * prefix, i.e. directories. For an asset at /tmp/path/vocab.txt, the filename
   * would be "vocab.txt".
   * </pre>
   *
   * <code>string filename = 2;</code>
   */
  public com.google.protobuf.ByteString
      getFilenameBytes() {
    java.lang.Object ref = filename_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      filename_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (tensorInfo_ != null) {
      output.writeMessage(1, getTensorInfo());
    }
    if (!getFilenameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, filename_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (tensorInfo_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getTensorInfo());
    }
    if (!getFilenameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, filename_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.tensorflow.framework.AssetFileDef)) {
      return super.equals(obj);
    }
    org.tensorflow.framework.AssetFileDef other = (org.tensorflow.framework.AssetFileDef) obj;

    if (hasTensorInfo() != other.hasTensorInfo()) return false;
    if (hasTensorInfo()) {
      if (!getTensorInfo()
          .equals(other.getTensorInfo())) return false;
    }
    if (!getFilename()
        .equals(other.getFilename())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasTensorInfo()) {
      hash = (37 * hash) + TENSOR_INFO_FIELD_NUMBER;
      hash = (53 * hash) + getTensorInfo().hashCode();
    }
    hash = (37 * hash) + FILENAME_FIELD_NUMBER;
    hash = (53 * hash) + getFilename().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.framework.AssetFileDef parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.AssetFileDef parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.AssetFileDef parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.AssetFileDef parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.AssetFileDef parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.AssetFileDef parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.AssetFileDef parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.AssetFileDef parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.framework.AssetFileDef parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.AssetFileDef parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.framework.AssetFileDef parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.AssetFileDef parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.tensorflow.framework.AssetFileDef prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * An asset file def for a single file or a set of sharded files with the same
   * name.
   * </pre>
   *
   * Protobuf type {@code tensorflow.AssetFileDef}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.AssetFileDef)
      org.tensorflow.framework.AssetFileDefOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.framework.MetaGraphProtos.internal_static_tensorflow_AssetFileDef_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.framework.MetaGraphProtos.internal_static_tensorflow_AssetFileDef_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.framework.AssetFileDef.class, org.tensorflow.framework.AssetFileDef.Builder.class);
    }

    // Construct using org.tensorflow.framework.AssetFileDef.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (tensorInfoBuilder_ == null) {
        tensorInfo_ = null;
      } else {
        tensorInfo_ = null;
        tensorInfoBuilder_ = null;
      }
      filename_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.framework.MetaGraphProtos.internal_static_tensorflow_AssetFileDef_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.framework.AssetFileDef getDefaultInstanceForType() {
      return org.tensorflow.framework.AssetFileDef.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.framework.AssetFileDef build() {
      org.tensorflow.framework.AssetFileDef result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.framework.AssetFileDef buildPartial() {
      org.tensorflow.framework.AssetFileDef result = new org.tensorflow.framework.AssetFileDef(this);
      if (tensorInfoBuilder_ == null) {
        result.tensorInfo_ = tensorInfo_;
      } else {
        result.tensorInfo_ = tensorInfoBuilder_.build();
      }
      result.filename_ = filename_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.tensorflow.framework.AssetFileDef) {
        return mergeFrom((org.tensorflow.framework.AssetFileDef)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.framework.AssetFileDef other) {
      if (other == org.tensorflow.framework.AssetFileDef.getDefaultInstance()) return this;
      if (other.hasTensorInfo()) {
        mergeTensorInfo(other.getTensorInfo());
      }
      if (!other.getFilename().isEmpty()) {
        filename_ = other.filename_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.tensorflow.framework.AssetFileDef parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tensorflow.framework.AssetFileDef) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private org.tensorflow.framework.TensorInfo tensorInfo_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.framework.TensorInfo, org.tensorflow.framework.TensorInfo.Builder, org.tensorflow.framework.TensorInfoOrBuilder> tensorInfoBuilder_;
    /**
     * <pre>
     * The tensor to bind the asset filename to.
     * </pre>
     *
     * <code>.tensorflow.TensorInfo tensor_info = 1;</code>
     */
    public boolean hasTensorInfo() {
      return tensorInfoBuilder_ != null || tensorInfo_ != null;
    }
    /**
     * <pre>
     * The tensor to bind the asset filename to.
     * </pre>
     *
     * <code>.tensorflow.TensorInfo tensor_info = 1;</code>
     */
    public org.tensorflow.framework.TensorInfo getTensorInfo() {
      if (tensorInfoBuilder_ == null) {
        return tensorInfo_ == null ? org.tensorflow.framework.TensorInfo.getDefaultInstance() : tensorInfo_;
      } else {
        return tensorInfoBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The tensor to bind the asset filename to.
     * </pre>
     *
     * <code>.tensorflow.TensorInfo tensor_info = 1;</code>
     */
    public Builder setTensorInfo(org.tensorflow.framework.TensorInfo value) {
      if (tensorInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        tensorInfo_ = value;
        onChanged();
      } else {
        tensorInfoBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The tensor to bind the asset filename to.
     * </pre>
     *
     * <code>.tensorflow.TensorInfo tensor_info = 1;</code>
     */
    public Builder setTensorInfo(
        org.tensorflow.framework.TensorInfo.Builder builderForValue) {
      if (tensorInfoBuilder_ == null) {
        tensorInfo_ = builderForValue.build();
        onChanged();
      } else {
        tensorInfoBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The tensor to bind the asset filename to.
     * </pre>
     *
     * <code>.tensorflow.TensorInfo tensor_info = 1;</code>
     */
    public Builder mergeTensorInfo(org.tensorflow.framework.TensorInfo value) {
      if (tensorInfoBuilder_ == null) {
        if (tensorInfo_ != null) {
          tensorInfo_ =
            org.tensorflow.framework.TensorInfo.newBuilder(tensorInfo_).mergeFrom(value).buildPartial();
        } else {
          tensorInfo_ = value;
        }
        onChanged();
      } else {
        tensorInfoBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The tensor to bind the asset filename to.
     * </pre>
     *
     * <code>.tensorflow.TensorInfo tensor_info = 1;</code>
     */
    public Builder clearTensorInfo() {
      if (tensorInfoBuilder_ == null) {
        tensorInfo_ = null;
        onChanged();
      } else {
        tensorInfo_ = null;
        tensorInfoBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The tensor to bind the asset filename to.
     * </pre>
     *
     * <code>.tensorflow.TensorInfo tensor_info = 1;</code>
     */
    public org.tensorflow.framework.TensorInfo.Builder getTensorInfoBuilder() {
      
      onChanged();
      return getTensorInfoFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The tensor to bind the asset filename to.
     * </pre>
     *
     * <code>.tensorflow.TensorInfo tensor_info = 1;</code>
     */
    public org.tensorflow.framework.TensorInfoOrBuilder getTensorInfoOrBuilder() {
      if (tensorInfoBuilder_ != null) {
        return tensorInfoBuilder_.getMessageOrBuilder();
      } else {
        return tensorInfo_ == null ?
            org.tensorflow.framework.TensorInfo.getDefaultInstance() : tensorInfo_;
      }
    }
    /**
     * <pre>
     * The tensor to bind the asset filename to.
     * </pre>
     *
     * <code>.tensorflow.TensorInfo tensor_info = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.framework.TensorInfo, org.tensorflow.framework.TensorInfo.Builder, org.tensorflow.framework.TensorInfoOrBuilder> 
        getTensorInfoFieldBuilder() {
      if (tensorInfoBuilder_ == null) {
        tensorInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.tensorflow.framework.TensorInfo, org.tensorflow.framework.TensorInfo.Builder, org.tensorflow.framework.TensorInfoOrBuilder>(
                getTensorInfo(),
                getParentForChildren(),
                isClean());
        tensorInfo_ = null;
      }
      return tensorInfoBuilder_;
    }

    private java.lang.Object filename_ = "";
    /**
     * <pre>
     * The filename within an assets directory. Note: does not include the path
     * prefix, i.e. directories. For an asset at /tmp/path/vocab.txt, the filename
     * would be "vocab.txt".
     * </pre>
     *
     * <code>string filename = 2;</code>
     */
    public java.lang.String getFilename() {
      java.lang.Object ref = filename_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        filename_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The filename within an assets directory. Note: does not include the path
     * prefix, i.e. directories. For an asset at /tmp/path/vocab.txt, the filename
     * would be "vocab.txt".
     * </pre>
     *
     * <code>string filename = 2;</code>
     */
    public com.google.protobuf.ByteString
        getFilenameBytes() {
      java.lang.Object ref = filename_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        filename_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The filename within an assets directory. Note: does not include the path
     * prefix, i.e. directories. For an asset at /tmp/path/vocab.txt, the filename
     * would be "vocab.txt".
     * </pre>
     *
     * <code>string filename = 2;</code>
     */
    public Builder setFilename(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      filename_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The filename within an assets directory. Note: does not include the path
     * prefix, i.e. directories. For an asset at /tmp/path/vocab.txt, the filename
     * would be "vocab.txt".
     * </pre>
     *
     * <code>string filename = 2;</code>
     */
    public Builder clearFilename() {
      
      filename_ = getDefaultInstance().getFilename();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The filename within an assets directory. Note: does not include the path
     * prefix, i.e. directories. For an asset at /tmp/path/vocab.txt, the filename
     * would be "vocab.txt".
     * </pre>
     *
     * <code>string filename = 2;</code>
     */
    public Builder setFilenameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      filename_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:tensorflow.AssetFileDef)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.AssetFileDef)
  private static final org.tensorflow.framework.AssetFileDef DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.framework.AssetFileDef();
  }

  public static org.tensorflow.framework.AssetFileDef getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AssetFileDef>
      PARSER = new com.google.protobuf.AbstractParser<AssetFileDef>() {
    @java.lang.Override
    public AssetFileDef parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AssetFileDef(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AssetFileDef> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AssetFileDef> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.framework.AssetFileDef getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

