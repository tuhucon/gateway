// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/config.proto

package org.tensorflow.framework;

/**
 * Protobuf type {@code tensorflow.RPCOptions}
 */
public  final class RPCOptions extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.RPCOptions)
    RPCOptionsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RPCOptions.newBuilder() to construct.
  private RPCOptions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RPCOptions() {
    compressionAlgorithm_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RPCOptions(
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
          case 8: {

            useRpcForInprocessMaster_ = input.readBool();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            compressionAlgorithm_ = s;
            break;
          }
          case 24: {

            compressionLevel_ = input.readInt32();
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
    return org.tensorflow.framework.ConfigProtos.internal_static_tensorflow_RPCOptions_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.framework.ConfigProtos.internal_static_tensorflow_RPCOptions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.framework.RPCOptions.class, org.tensorflow.framework.RPCOptions.Builder.class);
  }

  public static final int USE_RPC_FOR_INPROCESS_MASTER_FIELD_NUMBER = 1;
  private boolean useRpcForInprocessMaster_;
  /**
   * <pre>
   * If true, always use RPC to contact the session target.
   * If false (the default option), TensorFlow may use an optimized
   * transport for client-master communication that avoids the RPC
   * stack. This option is primarily for used testing the RPC stack.
   * </pre>
   *
   * <code>bool use_rpc_for_inprocess_master = 1;</code>
   */
  public boolean getUseRpcForInprocessMaster() {
    return useRpcForInprocessMaster_;
  }

  public static final int COMPRESSION_ALGORITHM_FIELD_NUMBER = 2;
  private volatile java.lang.Object compressionAlgorithm_;
  /**
   * <pre>
   * The compression algorithm to be used. One of "deflate", "gzip".
   * </pre>
   *
   * <code>string compression_algorithm = 2;</code>
   */
  public java.lang.String getCompressionAlgorithm() {
    java.lang.Object ref = compressionAlgorithm_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      compressionAlgorithm_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The compression algorithm to be used. One of "deflate", "gzip".
   * </pre>
   *
   * <code>string compression_algorithm = 2;</code>
   */
  public com.google.protobuf.ByteString
      getCompressionAlgorithmBytes() {
    java.lang.Object ref = compressionAlgorithm_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      compressionAlgorithm_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COMPRESSION_LEVEL_FIELD_NUMBER = 3;
  private int compressionLevel_;
  /**
   * <pre>
   * If compression_algorithm is set, the compression level to be used.
   * From 0 (no compression), up to 3.
   * </pre>
   *
   * <code>int32 compression_level = 3;</code>
   */
  public int getCompressionLevel() {
    return compressionLevel_;
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
    if (useRpcForInprocessMaster_ != false) {
      output.writeBool(1, useRpcForInprocessMaster_);
    }
    if (!getCompressionAlgorithmBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, compressionAlgorithm_);
    }
    if (compressionLevel_ != 0) {
      output.writeInt32(3, compressionLevel_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (useRpcForInprocessMaster_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, useRpcForInprocessMaster_);
    }
    if (!getCompressionAlgorithmBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, compressionAlgorithm_);
    }
    if (compressionLevel_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, compressionLevel_);
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
    if (!(obj instanceof org.tensorflow.framework.RPCOptions)) {
      return super.equals(obj);
    }
    org.tensorflow.framework.RPCOptions other = (org.tensorflow.framework.RPCOptions) obj;

    if (getUseRpcForInprocessMaster()
        != other.getUseRpcForInprocessMaster()) return false;
    if (!getCompressionAlgorithm()
        .equals(other.getCompressionAlgorithm())) return false;
    if (getCompressionLevel()
        != other.getCompressionLevel()) return false;
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
    hash = (37 * hash) + USE_RPC_FOR_INPROCESS_MASTER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getUseRpcForInprocessMaster());
    hash = (37 * hash) + COMPRESSION_ALGORITHM_FIELD_NUMBER;
    hash = (53 * hash) + getCompressionAlgorithm().hashCode();
    hash = (37 * hash) + COMPRESSION_LEVEL_FIELD_NUMBER;
    hash = (53 * hash) + getCompressionLevel();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.framework.RPCOptions parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.RPCOptions parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.RPCOptions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.RPCOptions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.RPCOptions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.RPCOptions parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.RPCOptions parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.RPCOptions parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.framework.RPCOptions parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.RPCOptions parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.framework.RPCOptions parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.RPCOptions parseFrom(
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
  public static Builder newBuilder(org.tensorflow.framework.RPCOptions prototype) {
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
   * Protobuf type {@code tensorflow.RPCOptions}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.RPCOptions)
      org.tensorflow.framework.RPCOptionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.framework.ConfigProtos.internal_static_tensorflow_RPCOptions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.framework.ConfigProtos.internal_static_tensorflow_RPCOptions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.framework.RPCOptions.class, org.tensorflow.framework.RPCOptions.Builder.class);
    }

    // Construct using org.tensorflow.framework.RPCOptions.newBuilder()
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
      useRpcForInprocessMaster_ = false;

      compressionAlgorithm_ = "";

      compressionLevel_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.framework.ConfigProtos.internal_static_tensorflow_RPCOptions_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.framework.RPCOptions getDefaultInstanceForType() {
      return org.tensorflow.framework.RPCOptions.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.framework.RPCOptions build() {
      org.tensorflow.framework.RPCOptions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.framework.RPCOptions buildPartial() {
      org.tensorflow.framework.RPCOptions result = new org.tensorflow.framework.RPCOptions(this);
      result.useRpcForInprocessMaster_ = useRpcForInprocessMaster_;
      result.compressionAlgorithm_ = compressionAlgorithm_;
      result.compressionLevel_ = compressionLevel_;
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
      if (other instanceof org.tensorflow.framework.RPCOptions) {
        return mergeFrom((org.tensorflow.framework.RPCOptions)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.framework.RPCOptions other) {
      if (other == org.tensorflow.framework.RPCOptions.getDefaultInstance()) return this;
      if (other.getUseRpcForInprocessMaster() != false) {
        setUseRpcForInprocessMaster(other.getUseRpcForInprocessMaster());
      }
      if (!other.getCompressionAlgorithm().isEmpty()) {
        compressionAlgorithm_ = other.compressionAlgorithm_;
        onChanged();
      }
      if (other.getCompressionLevel() != 0) {
        setCompressionLevel(other.getCompressionLevel());
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
      org.tensorflow.framework.RPCOptions parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tensorflow.framework.RPCOptions) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean useRpcForInprocessMaster_ ;
    /**
     * <pre>
     * If true, always use RPC to contact the session target.
     * If false (the default option), TensorFlow may use an optimized
     * transport for client-master communication that avoids the RPC
     * stack. This option is primarily for used testing the RPC stack.
     * </pre>
     *
     * <code>bool use_rpc_for_inprocess_master = 1;</code>
     */
    public boolean getUseRpcForInprocessMaster() {
      return useRpcForInprocessMaster_;
    }
    /**
     * <pre>
     * If true, always use RPC to contact the session target.
     * If false (the default option), TensorFlow may use an optimized
     * transport for client-master communication that avoids the RPC
     * stack. This option is primarily for used testing the RPC stack.
     * </pre>
     *
     * <code>bool use_rpc_for_inprocess_master = 1;</code>
     */
    public Builder setUseRpcForInprocessMaster(boolean value) {
      
      useRpcForInprocessMaster_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If true, always use RPC to contact the session target.
     * If false (the default option), TensorFlow may use an optimized
     * transport for client-master communication that avoids the RPC
     * stack. This option is primarily for used testing the RPC stack.
     * </pre>
     *
     * <code>bool use_rpc_for_inprocess_master = 1;</code>
     */
    public Builder clearUseRpcForInprocessMaster() {
      
      useRpcForInprocessMaster_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object compressionAlgorithm_ = "";
    /**
     * <pre>
     * The compression algorithm to be used. One of "deflate", "gzip".
     * </pre>
     *
     * <code>string compression_algorithm = 2;</code>
     */
    public java.lang.String getCompressionAlgorithm() {
      java.lang.Object ref = compressionAlgorithm_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        compressionAlgorithm_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The compression algorithm to be used. One of "deflate", "gzip".
     * </pre>
     *
     * <code>string compression_algorithm = 2;</code>
     */
    public com.google.protobuf.ByteString
        getCompressionAlgorithmBytes() {
      java.lang.Object ref = compressionAlgorithm_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        compressionAlgorithm_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The compression algorithm to be used. One of "deflate", "gzip".
     * </pre>
     *
     * <code>string compression_algorithm = 2;</code>
     */
    public Builder setCompressionAlgorithm(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      compressionAlgorithm_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The compression algorithm to be used. One of "deflate", "gzip".
     * </pre>
     *
     * <code>string compression_algorithm = 2;</code>
     */
    public Builder clearCompressionAlgorithm() {
      
      compressionAlgorithm_ = getDefaultInstance().getCompressionAlgorithm();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The compression algorithm to be used. One of "deflate", "gzip".
     * </pre>
     *
     * <code>string compression_algorithm = 2;</code>
     */
    public Builder setCompressionAlgorithmBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      compressionAlgorithm_ = value;
      onChanged();
      return this;
    }

    private int compressionLevel_ ;
    /**
     * <pre>
     * If compression_algorithm is set, the compression level to be used.
     * From 0 (no compression), up to 3.
     * </pre>
     *
     * <code>int32 compression_level = 3;</code>
     */
    public int getCompressionLevel() {
      return compressionLevel_;
    }
    /**
     * <pre>
     * If compression_algorithm is set, the compression level to be used.
     * From 0 (no compression), up to 3.
     * </pre>
     *
     * <code>int32 compression_level = 3;</code>
     */
    public Builder setCompressionLevel(int value) {
      
      compressionLevel_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If compression_algorithm is set, the compression level to be used.
     * From 0 (no compression), up to 3.
     * </pre>
     *
     * <code>int32 compression_level = 3;</code>
     */
    public Builder clearCompressionLevel() {
      
      compressionLevel_ = 0;
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


    // @@protoc_insertion_point(builder_scope:tensorflow.RPCOptions)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.RPCOptions)
  private static final org.tensorflow.framework.RPCOptions DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.framework.RPCOptions();
  }

  public static org.tensorflow.framework.RPCOptions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RPCOptions>
      PARSER = new com.google.protobuf.AbstractParser<RPCOptions>() {
    @java.lang.Override
    public RPCOptions parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RPCOptions(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RPCOptions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RPCOptions> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.framework.RPCOptions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
