// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/worker.proto

package org.tensorflow.distruntime;

/**
 * <pre>
 * Confirms that every op in the instance has consistently declared itself.
 * Also gives the source_rank in case of broadcast.
 * </pre>
 *
 * Protobuf type {@code tensorflow.CompleteInstanceResponse}
 */
public  final class CompleteInstanceResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.CompleteInstanceResponse)
    CompleteInstanceResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CompleteInstanceResponse.newBuilder() to construct.
  private CompleteInstanceResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CompleteInstanceResponse() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CompleteInstanceResponse(
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

            instanceKey_ = input.readInt32();
            break;
          }
          case 16: {

            sourceRank_ = input.readInt32();
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
    return org.tensorflow.distruntime.WorkerProtos.internal_static_tensorflow_CompleteInstanceResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.distruntime.WorkerProtos.internal_static_tensorflow_CompleteInstanceResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.distruntime.CompleteInstanceResponse.class, org.tensorflow.distruntime.CompleteInstanceResponse.Builder.class);
  }

  public static final int INSTANCE_KEY_FIELD_NUMBER = 1;
  private int instanceKey_;
  /**
   * <code>int32 instance_key = 1;</code>
   */
  public int getInstanceKey() {
    return instanceKey_;
  }

  public static final int SOURCE_RANK_FIELD_NUMBER = 2;
  private int sourceRank_;
  /**
   * <code>int32 source_rank = 2;</code>
   */
  public int getSourceRank() {
    return sourceRank_;
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
    if (instanceKey_ != 0) {
      output.writeInt32(1, instanceKey_);
    }
    if (sourceRank_ != 0) {
      output.writeInt32(2, sourceRank_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (instanceKey_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, instanceKey_);
    }
    if (sourceRank_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, sourceRank_);
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
    if (!(obj instanceof org.tensorflow.distruntime.CompleteInstanceResponse)) {
      return super.equals(obj);
    }
    org.tensorflow.distruntime.CompleteInstanceResponse other = (org.tensorflow.distruntime.CompleteInstanceResponse) obj;

    if (getInstanceKey()
        != other.getInstanceKey()) return false;
    if (getSourceRank()
        != other.getSourceRank()) return false;
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
    hash = (37 * hash) + INSTANCE_KEY_FIELD_NUMBER;
    hash = (53 * hash) + getInstanceKey();
    hash = (37 * hash) + SOURCE_RANK_FIELD_NUMBER;
    hash = (53 * hash) + getSourceRank();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.distruntime.CompleteInstanceResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.distruntime.CompleteInstanceResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.distruntime.CompleteInstanceResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.distruntime.CompleteInstanceResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.distruntime.CompleteInstanceResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.distruntime.CompleteInstanceResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.distruntime.CompleteInstanceResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.distruntime.CompleteInstanceResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.distruntime.CompleteInstanceResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.distruntime.CompleteInstanceResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.distruntime.CompleteInstanceResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.distruntime.CompleteInstanceResponse parseFrom(
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
  public static Builder newBuilder(org.tensorflow.distruntime.CompleteInstanceResponse prototype) {
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
   * Confirms that every op in the instance has consistently declared itself.
   * Also gives the source_rank in case of broadcast.
   * </pre>
   *
   * Protobuf type {@code tensorflow.CompleteInstanceResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.CompleteInstanceResponse)
      org.tensorflow.distruntime.CompleteInstanceResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.distruntime.WorkerProtos.internal_static_tensorflow_CompleteInstanceResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.distruntime.WorkerProtos.internal_static_tensorflow_CompleteInstanceResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.distruntime.CompleteInstanceResponse.class, org.tensorflow.distruntime.CompleteInstanceResponse.Builder.class);
    }

    // Construct using org.tensorflow.distruntime.CompleteInstanceResponse.newBuilder()
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
      instanceKey_ = 0;

      sourceRank_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.distruntime.WorkerProtos.internal_static_tensorflow_CompleteInstanceResponse_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.distruntime.CompleteInstanceResponse getDefaultInstanceForType() {
      return org.tensorflow.distruntime.CompleteInstanceResponse.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.distruntime.CompleteInstanceResponse build() {
      org.tensorflow.distruntime.CompleteInstanceResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.distruntime.CompleteInstanceResponse buildPartial() {
      org.tensorflow.distruntime.CompleteInstanceResponse result = new org.tensorflow.distruntime.CompleteInstanceResponse(this);
      result.instanceKey_ = instanceKey_;
      result.sourceRank_ = sourceRank_;
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
      if (other instanceof org.tensorflow.distruntime.CompleteInstanceResponse) {
        return mergeFrom((org.tensorflow.distruntime.CompleteInstanceResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.distruntime.CompleteInstanceResponse other) {
      if (other == org.tensorflow.distruntime.CompleteInstanceResponse.getDefaultInstance()) return this;
      if (other.getInstanceKey() != 0) {
        setInstanceKey(other.getInstanceKey());
      }
      if (other.getSourceRank() != 0) {
        setSourceRank(other.getSourceRank());
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
      org.tensorflow.distruntime.CompleteInstanceResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tensorflow.distruntime.CompleteInstanceResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int instanceKey_ ;
    /**
     * <code>int32 instance_key = 1;</code>
     */
    public int getInstanceKey() {
      return instanceKey_;
    }
    /**
     * <code>int32 instance_key = 1;</code>
     */
    public Builder setInstanceKey(int value) {
      
      instanceKey_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 instance_key = 1;</code>
     */
    public Builder clearInstanceKey() {
      
      instanceKey_ = 0;
      onChanged();
      return this;
    }

    private int sourceRank_ ;
    /**
     * <code>int32 source_rank = 2;</code>
     */
    public int getSourceRank() {
      return sourceRank_;
    }
    /**
     * <code>int32 source_rank = 2;</code>
     */
    public Builder setSourceRank(int value) {
      
      sourceRank_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 source_rank = 2;</code>
     */
    public Builder clearSourceRank() {
      
      sourceRank_ = 0;
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


    // @@protoc_insertion_point(builder_scope:tensorflow.CompleteInstanceResponse)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.CompleteInstanceResponse)
  private static final org.tensorflow.distruntime.CompleteInstanceResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.distruntime.CompleteInstanceResponse();
  }

  public static org.tensorflow.distruntime.CompleteInstanceResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CompleteInstanceResponse>
      PARSER = new com.google.protobuf.AbstractParser<CompleteInstanceResponse>() {
    @java.lang.Override
    public CompleteInstanceResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CompleteInstanceResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CompleteInstanceResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CompleteInstanceResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.distruntime.CompleteInstanceResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

