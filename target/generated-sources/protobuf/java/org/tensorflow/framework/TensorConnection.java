// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/config.proto

package org.tensorflow.framework;

/**
 * <pre>
 * Defines a connection between two tensors in a `GraphDef`.
 * </pre>
 *
 * Protobuf type {@code tensorflow.TensorConnection}
 */
public  final class TensorConnection extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.TensorConnection)
    TensorConnectionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TensorConnection.newBuilder() to construct.
  private TensorConnection(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TensorConnection() {
    fromTensor_ = "";
    toTensor_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TensorConnection(
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
            java.lang.String s = input.readStringRequireUtf8();

            fromTensor_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            toTensor_ = s;
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
    return org.tensorflow.framework.ConfigProtos.internal_static_tensorflow_TensorConnection_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.framework.ConfigProtos.internal_static_tensorflow_TensorConnection_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.framework.TensorConnection.class, org.tensorflow.framework.TensorConnection.Builder.class);
  }

  public static final int FROM_TENSOR_FIELD_NUMBER = 1;
  private volatile java.lang.Object fromTensor_;
  /**
   * <pre>
   * A tensor name. The value of this tensor will be substituted for
   * the tensor named in `to_tensor`.
   * </pre>
   *
   * <code>string from_tensor = 1;</code>
   */
  public java.lang.String getFromTensor() {
    java.lang.Object ref = fromTensor_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fromTensor_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * A tensor name. The value of this tensor will be substituted for
   * the tensor named in `to_tensor`.
   * </pre>
   *
   * <code>string from_tensor = 1;</code>
   */
  public com.google.protobuf.ByteString
      getFromTensorBytes() {
    java.lang.Object ref = fromTensor_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fromTensor_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TO_TENSOR_FIELD_NUMBER = 2;
  private volatile java.lang.Object toTensor_;
  /**
   * <pre>
   * A tensor name. The value of this tensor will be bound to the
   * value of the tensor named in `from_tensor`.
   * </pre>
   *
   * <code>string to_tensor = 2;</code>
   */
  public java.lang.String getToTensor() {
    java.lang.Object ref = toTensor_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      toTensor_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * A tensor name. The value of this tensor will be bound to the
   * value of the tensor named in `from_tensor`.
   * </pre>
   *
   * <code>string to_tensor = 2;</code>
   */
  public com.google.protobuf.ByteString
      getToTensorBytes() {
    java.lang.Object ref = toTensor_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      toTensor_ = b;
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
    if (!getFromTensorBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, fromTensor_);
    }
    if (!getToTensorBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, toTensor_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getFromTensorBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, fromTensor_);
    }
    if (!getToTensorBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, toTensor_);
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
    if (!(obj instanceof org.tensorflow.framework.TensorConnection)) {
      return super.equals(obj);
    }
    org.tensorflow.framework.TensorConnection other = (org.tensorflow.framework.TensorConnection) obj;

    if (!getFromTensor()
        .equals(other.getFromTensor())) return false;
    if (!getToTensor()
        .equals(other.getToTensor())) return false;
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
    hash = (37 * hash) + FROM_TENSOR_FIELD_NUMBER;
    hash = (53 * hash) + getFromTensor().hashCode();
    hash = (37 * hash) + TO_TENSOR_FIELD_NUMBER;
    hash = (53 * hash) + getToTensor().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.framework.TensorConnection parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.TensorConnection parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.TensorConnection parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.TensorConnection parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.TensorConnection parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.TensorConnection parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.TensorConnection parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.TensorConnection parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.framework.TensorConnection parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.TensorConnection parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.framework.TensorConnection parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.TensorConnection parseFrom(
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
  public static Builder newBuilder(org.tensorflow.framework.TensorConnection prototype) {
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
   * Defines a connection between two tensors in a `GraphDef`.
   * </pre>
   *
   * Protobuf type {@code tensorflow.TensorConnection}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.TensorConnection)
      org.tensorflow.framework.TensorConnectionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.framework.ConfigProtos.internal_static_tensorflow_TensorConnection_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.framework.ConfigProtos.internal_static_tensorflow_TensorConnection_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.framework.TensorConnection.class, org.tensorflow.framework.TensorConnection.Builder.class);
    }

    // Construct using org.tensorflow.framework.TensorConnection.newBuilder()
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
      fromTensor_ = "";

      toTensor_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.framework.ConfigProtos.internal_static_tensorflow_TensorConnection_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.framework.TensorConnection getDefaultInstanceForType() {
      return org.tensorflow.framework.TensorConnection.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.framework.TensorConnection build() {
      org.tensorflow.framework.TensorConnection result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.framework.TensorConnection buildPartial() {
      org.tensorflow.framework.TensorConnection result = new org.tensorflow.framework.TensorConnection(this);
      result.fromTensor_ = fromTensor_;
      result.toTensor_ = toTensor_;
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
      if (other instanceof org.tensorflow.framework.TensorConnection) {
        return mergeFrom((org.tensorflow.framework.TensorConnection)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.framework.TensorConnection other) {
      if (other == org.tensorflow.framework.TensorConnection.getDefaultInstance()) return this;
      if (!other.getFromTensor().isEmpty()) {
        fromTensor_ = other.fromTensor_;
        onChanged();
      }
      if (!other.getToTensor().isEmpty()) {
        toTensor_ = other.toTensor_;
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
      org.tensorflow.framework.TensorConnection parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tensorflow.framework.TensorConnection) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object fromTensor_ = "";
    /**
     * <pre>
     * A tensor name. The value of this tensor will be substituted for
     * the tensor named in `to_tensor`.
     * </pre>
     *
     * <code>string from_tensor = 1;</code>
     */
    public java.lang.String getFromTensor() {
      java.lang.Object ref = fromTensor_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fromTensor_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * A tensor name. The value of this tensor will be substituted for
     * the tensor named in `to_tensor`.
     * </pre>
     *
     * <code>string from_tensor = 1;</code>
     */
    public com.google.protobuf.ByteString
        getFromTensorBytes() {
      java.lang.Object ref = fromTensor_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fromTensor_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A tensor name. The value of this tensor will be substituted for
     * the tensor named in `to_tensor`.
     * </pre>
     *
     * <code>string from_tensor = 1;</code>
     */
    public Builder setFromTensor(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      fromTensor_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A tensor name. The value of this tensor will be substituted for
     * the tensor named in `to_tensor`.
     * </pre>
     *
     * <code>string from_tensor = 1;</code>
     */
    public Builder clearFromTensor() {
      
      fromTensor_ = getDefaultInstance().getFromTensor();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A tensor name. The value of this tensor will be substituted for
     * the tensor named in `to_tensor`.
     * </pre>
     *
     * <code>string from_tensor = 1;</code>
     */
    public Builder setFromTensorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      fromTensor_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object toTensor_ = "";
    /**
     * <pre>
     * A tensor name. The value of this tensor will be bound to the
     * value of the tensor named in `from_tensor`.
     * </pre>
     *
     * <code>string to_tensor = 2;</code>
     */
    public java.lang.String getToTensor() {
      java.lang.Object ref = toTensor_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        toTensor_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * A tensor name. The value of this tensor will be bound to the
     * value of the tensor named in `from_tensor`.
     * </pre>
     *
     * <code>string to_tensor = 2;</code>
     */
    public com.google.protobuf.ByteString
        getToTensorBytes() {
      java.lang.Object ref = toTensor_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        toTensor_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A tensor name. The value of this tensor will be bound to the
     * value of the tensor named in `from_tensor`.
     * </pre>
     *
     * <code>string to_tensor = 2;</code>
     */
    public Builder setToTensor(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      toTensor_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A tensor name. The value of this tensor will be bound to the
     * value of the tensor named in `from_tensor`.
     * </pre>
     *
     * <code>string to_tensor = 2;</code>
     */
    public Builder clearToTensor() {
      
      toTensor_ = getDefaultInstance().getToTensor();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A tensor name. The value of this tensor will be bound to the
     * value of the tensor named in `from_tensor`.
     * </pre>
     *
     * <code>string to_tensor = 2;</code>
     */
    public Builder setToTensorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      toTensor_ = value;
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


    // @@protoc_insertion_point(builder_scope:tensorflow.TensorConnection)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.TensorConnection)
  private static final org.tensorflow.framework.TensorConnection DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.framework.TensorConnection();
  }

  public static org.tensorflow.framework.TensorConnection getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TensorConnection>
      PARSER = new com.google.protobuf.AbstractParser<TensorConnection>() {
    @java.lang.Override
    public TensorConnection parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TensorConnection(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TensorConnection> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TensorConnection> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.framework.TensorConnection getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

