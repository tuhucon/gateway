// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/worker.proto

package org.tensorflow.distruntime;

/**
 * <pre>
 * Request for next agreed-upon step_id for the specified graph_keys.
 * This is used to enable multiple graphs containing nodes from
 * a common collective instance to coordinate using the same step_ids.
 * </pre>
 *
 * Protobuf type {@code tensorflow.GetStepSequenceRequest}
 */
public  final class GetStepSequenceRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.GetStepSequenceRequest)
    GetStepSequenceRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetStepSequenceRequest.newBuilder() to construct.
  private GetStepSequenceRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetStepSequenceRequest() {
    graphKey_ = emptyLongList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetStepSequenceRequest(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              graphKey_ = newLongList();
              mutable_bitField0_ |= 0x00000001;
            }
            graphKey_.addLong(input.readInt64());
            break;
          }
          case 10: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              graphKey_ = newLongList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              graphKey_.addLong(input.readInt64());
            }
            input.popLimit(limit);
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        graphKey_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.distruntime.WorkerProtos.internal_static_tensorflow_GetStepSequenceRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.distruntime.WorkerProtos.internal_static_tensorflow_GetStepSequenceRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.distruntime.GetStepSequenceRequest.class, org.tensorflow.distruntime.GetStepSequenceRequest.Builder.class);
  }

  public static final int GRAPH_KEY_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.LongList graphKey_;
  /**
   * <code>repeated int64 graph_key = 1;</code>
   */
  public java.util.List<java.lang.Long>
      getGraphKeyList() {
    return graphKey_;
  }
  /**
   * <code>repeated int64 graph_key = 1;</code>
   */
  public int getGraphKeyCount() {
    return graphKey_.size();
  }
  /**
   * <code>repeated int64 graph_key = 1;</code>
   */
  public long getGraphKey(int index) {
    return graphKey_.getLong(index);
  }
  private int graphKeyMemoizedSerializedSize = -1;

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
    getSerializedSize();
    if (getGraphKeyList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(graphKeyMemoizedSerializedSize);
    }
    for (int i = 0; i < graphKey_.size(); i++) {
      output.writeInt64NoTag(graphKey_.getLong(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < graphKey_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt64SizeNoTag(graphKey_.getLong(i));
      }
      size += dataSize;
      if (!getGraphKeyList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      graphKeyMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof org.tensorflow.distruntime.GetStepSequenceRequest)) {
      return super.equals(obj);
    }
    org.tensorflow.distruntime.GetStepSequenceRequest other = (org.tensorflow.distruntime.GetStepSequenceRequest) obj;

    if (!getGraphKeyList()
        .equals(other.getGraphKeyList())) return false;
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
    if (getGraphKeyCount() > 0) {
      hash = (37 * hash) + GRAPH_KEY_FIELD_NUMBER;
      hash = (53 * hash) + getGraphKeyList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.distruntime.GetStepSequenceRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.distruntime.GetStepSequenceRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.distruntime.GetStepSequenceRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.distruntime.GetStepSequenceRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.distruntime.GetStepSequenceRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.distruntime.GetStepSequenceRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.distruntime.GetStepSequenceRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.distruntime.GetStepSequenceRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.distruntime.GetStepSequenceRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.distruntime.GetStepSequenceRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.distruntime.GetStepSequenceRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.distruntime.GetStepSequenceRequest parseFrom(
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
  public static Builder newBuilder(org.tensorflow.distruntime.GetStepSequenceRequest prototype) {
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
   * Request for next agreed-upon step_id for the specified graph_keys.
   * This is used to enable multiple graphs containing nodes from
   * a common collective instance to coordinate using the same step_ids.
   * </pre>
   *
   * Protobuf type {@code tensorflow.GetStepSequenceRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.GetStepSequenceRequest)
      org.tensorflow.distruntime.GetStepSequenceRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.distruntime.WorkerProtos.internal_static_tensorflow_GetStepSequenceRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.distruntime.WorkerProtos.internal_static_tensorflow_GetStepSequenceRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.distruntime.GetStepSequenceRequest.class, org.tensorflow.distruntime.GetStepSequenceRequest.Builder.class);
    }

    // Construct using org.tensorflow.distruntime.GetStepSequenceRequest.newBuilder()
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
      graphKey_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.distruntime.WorkerProtos.internal_static_tensorflow_GetStepSequenceRequest_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.distruntime.GetStepSequenceRequest getDefaultInstanceForType() {
      return org.tensorflow.distruntime.GetStepSequenceRequest.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.distruntime.GetStepSequenceRequest build() {
      org.tensorflow.distruntime.GetStepSequenceRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.distruntime.GetStepSequenceRequest buildPartial() {
      org.tensorflow.distruntime.GetStepSequenceRequest result = new org.tensorflow.distruntime.GetStepSequenceRequest(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        graphKey_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.graphKey_ = graphKey_;
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
      if (other instanceof org.tensorflow.distruntime.GetStepSequenceRequest) {
        return mergeFrom((org.tensorflow.distruntime.GetStepSequenceRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.distruntime.GetStepSequenceRequest other) {
      if (other == org.tensorflow.distruntime.GetStepSequenceRequest.getDefaultInstance()) return this;
      if (!other.graphKey_.isEmpty()) {
        if (graphKey_.isEmpty()) {
          graphKey_ = other.graphKey_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureGraphKeyIsMutable();
          graphKey_.addAll(other.graphKey_);
        }
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
      org.tensorflow.distruntime.GetStepSequenceRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tensorflow.distruntime.GetStepSequenceRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.Internal.LongList graphKey_ = emptyLongList();
    private void ensureGraphKeyIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        graphKey_ = mutableCopy(graphKey_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated int64 graph_key = 1;</code>
     */
    public java.util.List<java.lang.Long>
        getGraphKeyList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(graphKey_) : graphKey_;
    }
    /**
     * <code>repeated int64 graph_key = 1;</code>
     */
    public int getGraphKeyCount() {
      return graphKey_.size();
    }
    /**
     * <code>repeated int64 graph_key = 1;</code>
     */
    public long getGraphKey(int index) {
      return graphKey_.getLong(index);
    }
    /**
     * <code>repeated int64 graph_key = 1;</code>
     */
    public Builder setGraphKey(
        int index, long value) {
      ensureGraphKeyIsMutable();
      graphKey_.setLong(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 graph_key = 1;</code>
     */
    public Builder addGraphKey(long value) {
      ensureGraphKeyIsMutable();
      graphKey_.addLong(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 graph_key = 1;</code>
     */
    public Builder addAllGraphKey(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureGraphKeyIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, graphKey_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 graph_key = 1;</code>
     */
    public Builder clearGraphKey() {
      graphKey_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000001);
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


    // @@protoc_insertion_point(builder_scope:tensorflow.GetStepSequenceRequest)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.GetStepSequenceRequest)
  private static final org.tensorflow.distruntime.GetStepSequenceRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.distruntime.GetStepSequenceRequest();
  }

  public static org.tensorflow.distruntime.GetStepSequenceRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetStepSequenceRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetStepSequenceRequest>() {
    @java.lang.Override
    public GetStepSequenceRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetStepSequenceRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetStepSequenceRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetStepSequenceRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.distruntime.GetStepSequenceRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

