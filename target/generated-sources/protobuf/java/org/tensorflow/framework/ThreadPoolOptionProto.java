// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/config.proto

package org.tensorflow.framework;

/**
 * Protobuf type {@code tensorflow.ThreadPoolOptionProto}
 */
public  final class ThreadPoolOptionProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.ThreadPoolOptionProto)
    ThreadPoolOptionProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ThreadPoolOptionProto.newBuilder() to construct.
  private ThreadPoolOptionProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ThreadPoolOptionProto() {
    globalName_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ThreadPoolOptionProto(
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

            numThreads_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            globalName_ = s;
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
    return org.tensorflow.framework.ConfigProtos.internal_static_tensorflow_ThreadPoolOptionProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.framework.ConfigProtos.internal_static_tensorflow_ThreadPoolOptionProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.framework.ThreadPoolOptionProto.class, org.tensorflow.framework.ThreadPoolOptionProto.Builder.class);
  }

  public static final int NUM_THREADS_FIELD_NUMBER = 1;
  private int numThreads_;
  /**
   * <pre>
   * The number of threads in the pool.
   * 0 means the system picks a value based on where this option proto is used
   * (see the declaration of the specific field for more info).
   * </pre>
   *
   * <code>int32 num_threads = 1;</code>
   */
  public int getNumThreads() {
    return numThreads_;
  }

  public static final int GLOBAL_NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object globalName_;
  /**
   * <pre>
   * The global name of the threadpool.
   * If empty, then the threadpool is made and used according to the scope it's
   * in - e.g., for a session threadpool, it is used by that session only.
   * If non-empty, then:
   * - a global threadpool associated with this name is looked
   *   up or created. This allows, for example, sharing one threadpool across
   *   many sessions (e.g., like the default behavior, if
   *   inter_op_parallelism_threads is not configured), but still partitioning
   *   into a large and small pool.
   * - if the threadpool for this global_name already exists, then it is an
   *   error if the existing pool was created using a different num_threads
   *   value as is specified on this call.
   * - threadpools created this way are never garbage collected.
   * </pre>
   *
   * <code>string global_name = 2;</code>
   */
  public java.lang.String getGlobalName() {
    java.lang.Object ref = globalName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      globalName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The global name of the threadpool.
   * If empty, then the threadpool is made and used according to the scope it's
   * in - e.g., for a session threadpool, it is used by that session only.
   * If non-empty, then:
   * - a global threadpool associated with this name is looked
   *   up or created. This allows, for example, sharing one threadpool across
   *   many sessions (e.g., like the default behavior, if
   *   inter_op_parallelism_threads is not configured), but still partitioning
   *   into a large and small pool.
   * - if the threadpool for this global_name already exists, then it is an
   *   error if the existing pool was created using a different num_threads
   *   value as is specified on this call.
   * - threadpools created this way are never garbage collected.
   * </pre>
   *
   * <code>string global_name = 2;</code>
   */
  public com.google.protobuf.ByteString
      getGlobalNameBytes() {
    java.lang.Object ref = globalName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      globalName_ = b;
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
    if (numThreads_ != 0) {
      output.writeInt32(1, numThreads_);
    }
    if (!getGlobalNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, globalName_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (numThreads_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, numThreads_);
    }
    if (!getGlobalNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, globalName_);
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
    if (!(obj instanceof org.tensorflow.framework.ThreadPoolOptionProto)) {
      return super.equals(obj);
    }
    org.tensorflow.framework.ThreadPoolOptionProto other = (org.tensorflow.framework.ThreadPoolOptionProto) obj;

    if (getNumThreads()
        != other.getNumThreads()) return false;
    if (!getGlobalName()
        .equals(other.getGlobalName())) return false;
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
    hash = (37 * hash) + NUM_THREADS_FIELD_NUMBER;
    hash = (53 * hash) + getNumThreads();
    hash = (37 * hash) + GLOBAL_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getGlobalName().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.framework.ThreadPoolOptionProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.ThreadPoolOptionProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.ThreadPoolOptionProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.ThreadPoolOptionProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.ThreadPoolOptionProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.ThreadPoolOptionProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.ThreadPoolOptionProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.ThreadPoolOptionProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.framework.ThreadPoolOptionProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.ThreadPoolOptionProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.framework.ThreadPoolOptionProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.ThreadPoolOptionProto parseFrom(
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
  public static Builder newBuilder(org.tensorflow.framework.ThreadPoolOptionProto prototype) {
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
   * Protobuf type {@code tensorflow.ThreadPoolOptionProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.ThreadPoolOptionProto)
      org.tensorflow.framework.ThreadPoolOptionProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.framework.ConfigProtos.internal_static_tensorflow_ThreadPoolOptionProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.framework.ConfigProtos.internal_static_tensorflow_ThreadPoolOptionProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.framework.ThreadPoolOptionProto.class, org.tensorflow.framework.ThreadPoolOptionProto.Builder.class);
    }

    // Construct using org.tensorflow.framework.ThreadPoolOptionProto.newBuilder()
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
      numThreads_ = 0;

      globalName_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.framework.ConfigProtos.internal_static_tensorflow_ThreadPoolOptionProto_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.framework.ThreadPoolOptionProto getDefaultInstanceForType() {
      return org.tensorflow.framework.ThreadPoolOptionProto.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.framework.ThreadPoolOptionProto build() {
      org.tensorflow.framework.ThreadPoolOptionProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.framework.ThreadPoolOptionProto buildPartial() {
      org.tensorflow.framework.ThreadPoolOptionProto result = new org.tensorflow.framework.ThreadPoolOptionProto(this);
      result.numThreads_ = numThreads_;
      result.globalName_ = globalName_;
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
      if (other instanceof org.tensorflow.framework.ThreadPoolOptionProto) {
        return mergeFrom((org.tensorflow.framework.ThreadPoolOptionProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.framework.ThreadPoolOptionProto other) {
      if (other == org.tensorflow.framework.ThreadPoolOptionProto.getDefaultInstance()) return this;
      if (other.getNumThreads() != 0) {
        setNumThreads(other.getNumThreads());
      }
      if (!other.getGlobalName().isEmpty()) {
        globalName_ = other.globalName_;
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
      org.tensorflow.framework.ThreadPoolOptionProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tensorflow.framework.ThreadPoolOptionProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int numThreads_ ;
    /**
     * <pre>
     * The number of threads in the pool.
     * 0 means the system picks a value based on where this option proto is used
     * (see the declaration of the specific field for more info).
     * </pre>
     *
     * <code>int32 num_threads = 1;</code>
     */
    public int getNumThreads() {
      return numThreads_;
    }
    /**
     * <pre>
     * The number of threads in the pool.
     * 0 means the system picks a value based on where this option proto is used
     * (see the declaration of the specific field for more info).
     * </pre>
     *
     * <code>int32 num_threads = 1;</code>
     */
    public Builder setNumThreads(int value) {
      
      numThreads_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The number of threads in the pool.
     * 0 means the system picks a value based on where this option proto is used
     * (see the declaration of the specific field for more info).
     * </pre>
     *
     * <code>int32 num_threads = 1;</code>
     */
    public Builder clearNumThreads() {
      
      numThreads_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object globalName_ = "";
    /**
     * <pre>
     * The global name of the threadpool.
     * If empty, then the threadpool is made and used according to the scope it's
     * in - e.g., for a session threadpool, it is used by that session only.
     * If non-empty, then:
     * - a global threadpool associated with this name is looked
     *   up or created. This allows, for example, sharing one threadpool across
     *   many sessions (e.g., like the default behavior, if
     *   inter_op_parallelism_threads is not configured), but still partitioning
     *   into a large and small pool.
     * - if the threadpool for this global_name already exists, then it is an
     *   error if the existing pool was created using a different num_threads
     *   value as is specified on this call.
     * - threadpools created this way are never garbage collected.
     * </pre>
     *
     * <code>string global_name = 2;</code>
     */
    public java.lang.String getGlobalName() {
      java.lang.Object ref = globalName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        globalName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The global name of the threadpool.
     * If empty, then the threadpool is made and used according to the scope it's
     * in - e.g., for a session threadpool, it is used by that session only.
     * If non-empty, then:
     * - a global threadpool associated with this name is looked
     *   up or created. This allows, for example, sharing one threadpool across
     *   many sessions (e.g., like the default behavior, if
     *   inter_op_parallelism_threads is not configured), but still partitioning
     *   into a large and small pool.
     * - if the threadpool for this global_name already exists, then it is an
     *   error if the existing pool was created using a different num_threads
     *   value as is specified on this call.
     * - threadpools created this way are never garbage collected.
     * </pre>
     *
     * <code>string global_name = 2;</code>
     */
    public com.google.protobuf.ByteString
        getGlobalNameBytes() {
      java.lang.Object ref = globalName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        globalName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The global name of the threadpool.
     * If empty, then the threadpool is made and used according to the scope it's
     * in - e.g., for a session threadpool, it is used by that session only.
     * If non-empty, then:
     * - a global threadpool associated with this name is looked
     *   up or created. This allows, for example, sharing one threadpool across
     *   many sessions (e.g., like the default behavior, if
     *   inter_op_parallelism_threads is not configured), but still partitioning
     *   into a large and small pool.
     * - if the threadpool for this global_name already exists, then it is an
     *   error if the existing pool was created using a different num_threads
     *   value as is specified on this call.
     * - threadpools created this way are never garbage collected.
     * </pre>
     *
     * <code>string global_name = 2;</code>
     */
    public Builder setGlobalName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      globalName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The global name of the threadpool.
     * If empty, then the threadpool is made and used according to the scope it's
     * in - e.g., for a session threadpool, it is used by that session only.
     * If non-empty, then:
     * - a global threadpool associated with this name is looked
     *   up or created. This allows, for example, sharing one threadpool across
     *   many sessions (e.g., like the default behavior, if
     *   inter_op_parallelism_threads is not configured), but still partitioning
     *   into a large and small pool.
     * - if the threadpool for this global_name already exists, then it is an
     *   error if the existing pool was created using a different num_threads
     *   value as is specified on this call.
     * - threadpools created this way are never garbage collected.
     * </pre>
     *
     * <code>string global_name = 2;</code>
     */
    public Builder clearGlobalName() {
      
      globalName_ = getDefaultInstance().getGlobalName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The global name of the threadpool.
     * If empty, then the threadpool is made and used according to the scope it's
     * in - e.g., for a session threadpool, it is used by that session only.
     * If non-empty, then:
     * - a global threadpool associated with this name is looked
     *   up or created. This allows, for example, sharing one threadpool across
     *   many sessions (e.g., like the default behavior, if
     *   inter_op_parallelism_threads is not configured), but still partitioning
     *   into a large and small pool.
     * - if the threadpool for this global_name already exists, then it is an
     *   error if the existing pool was created using a different num_threads
     *   value as is specified on this call.
     * - threadpools created this way are never garbage collected.
     * </pre>
     *
     * <code>string global_name = 2;</code>
     */
    public Builder setGlobalNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      globalName_ = value;
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


    // @@protoc_insertion_point(builder_scope:tensorflow.ThreadPoolOptionProto)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.ThreadPoolOptionProto)
  private static final org.tensorflow.framework.ThreadPoolOptionProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.framework.ThreadPoolOptionProto();
  }

  public static org.tensorflow.framework.ThreadPoolOptionProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ThreadPoolOptionProto>
      PARSER = new com.google.protobuf.AbstractParser<ThreadPoolOptionProto>() {
    @java.lang.Override
    public ThreadPoolOptionProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ThreadPoolOptionProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ThreadPoolOptionProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ThreadPoolOptionProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.framework.ThreadPoolOptionProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

