// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/framework/device_attributes.proto

package org.tensorflow.framework;

/**
 * Protobuf type {@code tensorflow.LocalLinks}
 */
public  final class LocalLinks extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.LocalLinks)
    LocalLinksOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LocalLinks.newBuilder() to construct.
  private LocalLinks(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LocalLinks() {
    link_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LocalLinks(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              link_ = new java.util.ArrayList<org.tensorflow.framework.InterconnectLink>();
              mutable_bitField0_ |= 0x00000001;
            }
            link_.add(
                input.readMessage(org.tensorflow.framework.InterconnectLink.parser(), extensionRegistry));
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
        link_ = java.util.Collections.unmodifiableList(link_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.framework.DeviceAttributesProtos.internal_static_tensorflow_LocalLinks_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.framework.DeviceAttributesProtos.internal_static_tensorflow_LocalLinks_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.framework.LocalLinks.class, org.tensorflow.framework.LocalLinks.Builder.class);
  }

  public static final int LINK_FIELD_NUMBER = 1;
  private java.util.List<org.tensorflow.framework.InterconnectLink> link_;
  /**
   * <code>repeated .tensorflow.InterconnectLink link = 1;</code>
   */
  public java.util.List<org.tensorflow.framework.InterconnectLink> getLinkList() {
    return link_;
  }
  /**
   * <code>repeated .tensorflow.InterconnectLink link = 1;</code>
   */
  public java.util.List<? extends org.tensorflow.framework.InterconnectLinkOrBuilder> 
      getLinkOrBuilderList() {
    return link_;
  }
  /**
   * <code>repeated .tensorflow.InterconnectLink link = 1;</code>
   */
  public int getLinkCount() {
    return link_.size();
  }
  /**
   * <code>repeated .tensorflow.InterconnectLink link = 1;</code>
   */
  public org.tensorflow.framework.InterconnectLink getLink(int index) {
    return link_.get(index);
  }
  /**
   * <code>repeated .tensorflow.InterconnectLink link = 1;</code>
   */
  public org.tensorflow.framework.InterconnectLinkOrBuilder getLinkOrBuilder(
      int index) {
    return link_.get(index);
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
    for (int i = 0; i < link_.size(); i++) {
      output.writeMessage(1, link_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < link_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, link_.get(i));
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
    if (!(obj instanceof org.tensorflow.framework.LocalLinks)) {
      return super.equals(obj);
    }
    org.tensorflow.framework.LocalLinks other = (org.tensorflow.framework.LocalLinks) obj;

    if (!getLinkList()
        .equals(other.getLinkList())) return false;
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
    if (getLinkCount() > 0) {
      hash = (37 * hash) + LINK_FIELD_NUMBER;
      hash = (53 * hash) + getLinkList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.framework.LocalLinks parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.LocalLinks parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.LocalLinks parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.LocalLinks parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.LocalLinks parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.LocalLinks parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.LocalLinks parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.LocalLinks parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.framework.LocalLinks parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.LocalLinks parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.framework.LocalLinks parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.LocalLinks parseFrom(
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
  public static Builder newBuilder(org.tensorflow.framework.LocalLinks prototype) {
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
   * Protobuf type {@code tensorflow.LocalLinks}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.LocalLinks)
      org.tensorflow.framework.LocalLinksOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.framework.DeviceAttributesProtos.internal_static_tensorflow_LocalLinks_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.framework.DeviceAttributesProtos.internal_static_tensorflow_LocalLinks_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.framework.LocalLinks.class, org.tensorflow.framework.LocalLinks.Builder.class);
    }

    // Construct using org.tensorflow.framework.LocalLinks.newBuilder()
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
        getLinkFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (linkBuilder_ == null) {
        link_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        linkBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.framework.DeviceAttributesProtos.internal_static_tensorflow_LocalLinks_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.framework.LocalLinks getDefaultInstanceForType() {
      return org.tensorflow.framework.LocalLinks.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.framework.LocalLinks build() {
      org.tensorflow.framework.LocalLinks result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.framework.LocalLinks buildPartial() {
      org.tensorflow.framework.LocalLinks result = new org.tensorflow.framework.LocalLinks(this);
      int from_bitField0_ = bitField0_;
      if (linkBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          link_ = java.util.Collections.unmodifiableList(link_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.link_ = link_;
      } else {
        result.link_ = linkBuilder_.build();
      }
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
      if (other instanceof org.tensorflow.framework.LocalLinks) {
        return mergeFrom((org.tensorflow.framework.LocalLinks)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.framework.LocalLinks other) {
      if (other == org.tensorflow.framework.LocalLinks.getDefaultInstance()) return this;
      if (linkBuilder_ == null) {
        if (!other.link_.isEmpty()) {
          if (link_.isEmpty()) {
            link_ = other.link_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureLinkIsMutable();
            link_.addAll(other.link_);
          }
          onChanged();
        }
      } else {
        if (!other.link_.isEmpty()) {
          if (linkBuilder_.isEmpty()) {
            linkBuilder_.dispose();
            linkBuilder_ = null;
            link_ = other.link_;
            bitField0_ = (bitField0_ & ~0x00000001);
            linkBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getLinkFieldBuilder() : null;
          } else {
            linkBuilder_.addAllMessages(other.link_);
          }
        }
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
      org.tensorflow.framework.LocalLinks parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tensorflow.framework.LocalLinks) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<org.tensorflow.framework.InterconnectLink> link_ =
      java.util.Collections.emptyList();
    private void ensureLinkIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        link_ = new java.util.ArrayList<org.tensorflow.framework.InterconnectLink>(link_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.tensorflow.framework.InterconnectLink, org.tensorflow.framework.InterconnectLink.Builder, org.tensorflow.framework.InterconnectLinkOrBuilder> linkBuilder_;

    /**
     * <code>repeated .tensorflow.InterconnectLink link = 1;</code>
     */
    public java.util.List<org.tensorflow.framework.InterconnectLink> getLinkList() {
      if (linkBuilder_ == null) {
        return java.util.Collections.unmodifiableList(link_);
      } else {
        return linkBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .tensorflow.InterconnectLink link = 1;</code>
     */
    public int getLinkCount() {
      if (linkBuilder_ == null) {
        return link_.size();
      } else {
        return linkBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .tensorflow.InterconnectLink link = 1;</code>
     */
    public org.tensorflow.framework.InterconnectLink getLink(int index) {
      if (linkBuilder_ == null) {
        return link_.get(index);
      } else {
        return linkBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .tensorflow.InterconnectLink link = 1;</code>
     */
    public Builder setLink(
        int index, org.tensorflow.framework.InterconnectLink value) {
      if (linkBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLinkIsMutable();
        link_.set(index, value);
        onChanged();
      } else {
        linkBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.InterconnectLink link = 1;</code>
     */
    public Builder setLink(
        int index, org.tensorflow.framework.InterconnectLink.Builder builderForValue) {
      if (linkBuilder_ == null) {
        ensureLinkIsMutable();
        link_.set(index, builderForValue.build());
        onChanged();
      } else {
        linkBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.InterconnectLink link = 1;</code>
     */
    public Builder addLink(org.tensorflow.framework.InterconnectLink value) {
      if (linkBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLinkIsMutable();
        link_.add(value);
        onChanged();
      } else {
        linkBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.InterconnectLink link = 1;</code>
     */
    public Builder addLink(
        int index, org.tensorflow.framework.InterconnectLink value) {
      if (linkBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLinkIsMutable();
        link_.add(index, value);
        onChanged();
      } else {
        linkBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.InterconnectLink link = 1;</code>
     */
    public Builder addLink(
        org.tensorflow.framework.InterconnectLink.Builder builderForValue) {
      if (linkBuilder_ == null) {
        ensureLinkIsMutable();
        link_.add(builderForValue.build());
        onChanged();
      } else {
        linkBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.InterconnectLink link = 1;</code>
     */
    public Builder addLink(
        int index, org.tensorflow.framework.InterconnectLink.Builder builderForValue) {
      if (linkBuilder_ == null) {
        ensureLinkIsMutable();
        link_.add(index, builderForValue.build());
        onChanged();
      } else {
        linkBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.InterconnectLink link = 1;</code>
     */
    public Builder addAllLink(
        java.lang.Iterable<? extends org.tensorflow.framework.InterconnectLink> values) {
      if (linkBuilder_ == null) {
        ensureLinkIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, link_);
        onChanged();
      } else {
        linkBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.InterconnectLink link = 1;</code>
     */
    public Builder clearLink() {
      if (linkBuilder_ == null) {
        link_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        linkBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.InterconnectLink link = 1;</code>
     */
    public Builder removeLink(int index) {
      if (linkBuilder_ == null) {
        ensureLinkIsMutable();
        link_.remove(index);
        onChanged();
      } else {
        linkBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.InterconnectLink link = 1;</code>
     */
    public org.tensorflow.framework.InterconnectLink.Builder getLinkBuilder(
        int index) {
      return getLinkFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .tensorflow.InterconnectLink link = 1;</code>
     */
    public org.tensorflow.framework.InterconnectLinkOrBuilder getLinkOrBuilder(
        int index) {
      if (linkBuilder_ == null) {
        return link_.get(index);  } else {
        return linkBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .tensorflow.InterconnectLink link = 1;</code>
     */
    public java.util.List<? extends org.tensorflow.framework.InterconnectLinkOrBuilder> 
         getLinkOrBuilderList() {
      if (linkBuilder_ != null) {
        return linkBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(link_);
      }
    }
    /**
     * <code>repeated .tensorflow.InterconnectLink link = 1;</code>
     */
    public org.tensorflow.framework.InterconnectLink.Builder addLinkBuilder() {
      return getLinkFieldBuilder().addBuilder(
          org.tensorflow.framework.InterconnectLink.getDefaultInstance());
    }
    /**
     * <code>repeated .tensorflow.InterconnectLink link = 1;</code>
     */
    public org.tensorflow.framework.InterconnectLink.Builder addLinkBuilder(
        int index) {
      return getLinkFieldBuilder().addBuilder(
          index, org.tensorflow.framework.InterconnectLink.getDefaultInstance());
    }
    /**
     * <code>repeated .tensorflow.InterconnectLink link = 1;</code>
     */
    public java.util.List<org.tensorflow.framework.InterconnectLink.Builder> 
         getLinkBuilderList() {
      return getLinkFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.tensorflow.framework.InterconnectLink, org.tensorflow.framework.InterconnectLink.Builder, org.tensorflow.framework.InterconnectLinkOrBuilder> 
        getLinkFieldBuilder() {
      if (linkBuilder_ == null) {
        linkBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.tensorflow.framework.InterconnectLink, org.tensorflow.framework.InterconnectLink.Builder, org.tensorflow.framework.InterconnectLinkOrBuilder>(
                link_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        link_ = null;
      }
      return linkBuilder_;
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


    // @@protoc_insertion_point(builder_scope:tensorflow.LocalLinks)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.LocalLinks)
  private static final org.tensorflow.framework.LocalLinks DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.framework.LocalLinks();
  }

  public static org.tensorflow.framework.LocalLinks getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LocalLinks>
      PARSER = new com.google.protobuf.AbstractParser<LocalLinks>() {
    @java.lang.Override
    public LocalLinks parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LocalLinks(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LocalLinks> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LocalLinks> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.framework.LocalLinks getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

