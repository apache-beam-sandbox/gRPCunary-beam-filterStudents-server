// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: student.proto

package com.studentReader.generated.stubs;

/**
 * Protobuf type {@code prime.Address}
 */
public  final class Address extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:prime.Address)
    AddressOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Address.newBuilder() to construct.
  private Address(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Address() {
    houseNumber_ = "";
    phone_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Address(
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

            houseNumber_ = s;
            break;
          }
          case 16: {

            phone_ = input.readInt64();
            break;
          }
          case 26: {
            com.studentReader.generated.stubs.Street.Builder subBuilder = null;
            if (street_ != null) {
              subBuilder = street_.toBuilder();
            }
            street_ = input.readMessage(com.studentReader.generated.stubs.Street.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(street_);
              street_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
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
    return com.studentReader.generated.stubs.StudentOuterClass.internal_static_prime_Address_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.studentReader.generated.stubs.StudentOuterClass.internal_static_prime_Address_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.studentReader.generated.stubs.Address.class, com.studentReader.generated.stubs.Address.Builder.class);
  }

  public static final int HOUSENUMBER_FIELD_NUMBER = 1;
  private volatile java.lang.Object houseNumber_;
  /**
   * <code>string houseNumber = 1;</code>
   */
  public java.lang.String getHouseNumber() {
    java.lang.Object ref = houseNumber_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      houseNumber_ = s;
      return s;
    }
  }
  /**
   * <code>string houseNumber = 1;</code>
   */
  public com.google.protobuf.ByteString
      getHouseNumberBytes() {
    java.lang.Object ref = houseNumber_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      houseNumber_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PHONE_FIELD_NUMBER = 2;
  private long phone_;
  /**
   * <code>int64 phone = 2;</code>
   */
  public long getPhone() {
    return phone_;
  }

  public static final int STREET_FIELD_NUMBER = 3;
  private com.studentReader.generated.stubs.Street street_;
  /**
   * <code>.prime.Street street = 3;</code>
   */
  public boolean hasStreet() {
    return street_ != null;
  }
  /**
   * <code>.prime.Street street = 3;</code>
   */
  public com.studentReader.generated.stubs.Street getStreet() {
    return street_ == null ? com.studentReader.generated.stubs.Street.getDefaultInstance() : street_;
  }
  /**
   * <code>.prime.Street street = 3;</code>
   */
  public com.studentReader.generated.stubs.StreetOrBuilder getStreetOrBuilder() {
    return getStreet();
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
    if (!getHouseNumberBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, houseNumber_);
    }
    if (phone_ != 0L) {
      output.writeInt64(2, phone_);
    }
    if (street_ != null) {
      output.writeMessage(3, getStreet());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getHouseNumberBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, houseNumber_);
    }
    if (phone_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, phone_);
    }
    if (street_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getStreet());
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
    if (!(obj instanceof com.studentReader.generated.stubs.Address)) {
      return super.equals(obj);
    }
    com.studentReader.generated.stubs.Address other = (com.studentReader.generated.stubs.Address) obj;

    boolean result = true;
    result = result && getHouseNumber()
        .equals(other.getHouseNumber());
    result = result && (getPhone()
        == other.getPhone());
    result = result && (hasStreet() == other.hasStreet());
    if (hasStreet()) {
      result = result && getStreet()
          .equals(other.getStreet());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + HOUSENUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getHouseNumber().hashCode();
    hash = (37 * hash) + PHONE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPhone());
    if (hasStreet()) {
      hash = (37 * hash) + STREET_FIELD_NUMBER;
      hash = (53 * hash) + getStreet().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.studentReader.generated.stubs.Address parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.studentReader.generated.stubs.Address parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.studentReader.generated.stubs.Address parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.studentReader.generated.stubs.Address parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.studentReader.generated.stubs.Address parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.studentReader.generated.stubs.Address parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.studentReader.generated.stubs.Address parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.studentReader.generated.stubs.Address parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.studentReader.generated.stubs.Address parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.studentReader.generated.stubs.Address parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.studentReader.generated.stubs.Address parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.studentReader.generated.stubs.Address parseFrom(
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
  public static Builder newBuilder(com.studentReader.generated.stubs.Address prototype) {
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
   * Protobuf type {@code prime.Address}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:prime.Address)
      com.studentReader.generated.stubs.AddressOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.studentReader.generated.stubs.StudentOuterClass.internal_static_prime_Address_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.studentReader.generated.stubs.StudentOuterClass.internal_static_prime_Address_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.studentReader.generated.stubs.Address.class, com.studentReader.generated.stubs.Address.Builder.class);
    }

    // Construct using com.studentReader.generated.stubs.Address.newBuilder()
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
      houseNumber_ = "";

      phone_ = 0L;

      if (streetBuilder_ == null) {
        street_ = null;
      } else {
        street_ = null;
        streetBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.studentReader.generated.stubs.StudentOuterClass.internal_static_prime_Address_descriptor;
    }

    @java.lang.Override
    public com.studentReader.generated.stubs.Address getDefaultInstanceForType() {
      return com.studentReader.generated.stubs.Address.getDefaultInstance();
    }

    @java.lang.Override
    public com.studentReader.generated.stubs.Address build() {
      com.studentReader.generated.stubs.Address result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.studentReader.generated.stubs.Address buildPartial() {
      com.studentReader.generated.stubs.Address result = new com.studentReader.generated.stubs.Address(this);
      result.houseNumber_ = houseNumber_;
      result.phone_ = phone_;
      if (streetBuilder_ == null) {
        result.street_ = street_;
      } else {
        result.street_ = streetBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.studentReader.generated.stubs.Address) {
        return mergeFrom((com.studentReader.generated.stubs.Address)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.studentReader.generated.stubs.Address other) {
      if (other == com.studentReader.generated.stubs.Address.getDefaultInstance()) return this;
      if (!other.getHouseNumber().isEmpty()) {
        houseNumber_ = other.houseNumber_;
        onChanged();
      }
      if (other.getPhone() != 0L) {
        setPhone(other.getPhone());
      }
      if (other.hasStreet()) {
        mergeStreet(other.getStreet());
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
      com.studentReader.generated.stubs.Address parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.studentReader.generated.stubs.Address) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object houseNumber_ = "";
    /**
     * <code>string houseNumber = 1;</code>
     */
    public java.lang.String getHouseNumber() {
      java.lang.Object ref = houseNumber_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        houseNumber_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string houseNumber = 1;</code>
     */
    public com.google.protobuf.ByteString
        getHouseNumberBytes() {
      java.lang.Object ref = houseNumber_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        houseNumber_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string houseNumber = 1;</code>
     */
    public Builder setHouseNumber(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      houseNumber_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string houseNumber = 1;</code>
     */
    public Builder clearHouseNumber() {
      
      houseNumber_ = getDefaultInstance().getHouseNumber();
      onChanged();
      return this;
    }
    /**
     * <code>string houseNumber = 1;</code>
     */
    public Builder setHouseNumberBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      houseNumber_ = value;
      onChanged();
      return this;
    }

    private long phone_ ;
    /**
     * <code>int64 phone = 2;</code>
     */
    public long getPhone() {
      return phone_;
    }
    /**
     * <code>int64 phone = 2;</code>
     */
    public Builder setPhone(long value) {
      
      phone_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 phone = 2;</code>
     */
    public Builder clearPhone() {
      
      phone_ = 0L;
      onChanged();
      return this;
    }

    private com.studentReader.generated.stubs.Street street_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.studentReader.generated.stubs.Street, com.studentReader.generated.stubs.Street.Builder, com.studentReader.generated.stubs.StreetOrBuilder> streetBuilder_;
    /**
     * <code>.prime.Street street = 3;</code>
     */
    public boolean hasStreet() {
      return streetBuilder_ != null || street_ != null;
    }
    /**
     * <code>.prime.Street street = 3;</code>
     */
    public com.studentReader.generated.stubs.Street getStreet() {
      if (streetBuilder_ == null) {
        return street_ == null ? com.studentReader.generated.stubs.Street.getDefaultInstance() : street_;
      } else {
        return streetBuilder_.getMessage();
      }
    }
    /**
     * <code>.prime.Street street = 3;</code>
     */
    public Builder setStreet(com.studentReader.generated.stubs.Street value) {
      if (streetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        street_ = value;
        onChanged();
      } else {
        streetBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.prime.Street street = 3;</code>
     */
    public Builder setStreet(
        com.studentReader.generated.stubs.Street.Builder builderForValue) {
      if (streetBuilder_ == null) {
        street_ = builderForValue.build();
        onChanged();
      } else {
        streetBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.prime.Street street = 3;</code>
     */
    public Builder mergeStreet(com.studentReader.generated.stubs.Street value) {
      if (streetBuilder_ == null) {
        if (street_ != null) {
          street_ =
            com.studentReader.generated.stubs.Street.newBuilder(street_).mergeFrom(value).buildPartial();
        } else {
          street_ = value;
        }
        onChanged();
      } else {
        streetBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.prime.Street street = 3;</code>
     */
    public Builder clearStreet() {
      if (streetBuilder_ == null) {
        street_ = null;
        onChanged();
      } else {
        street_ = null;
        streetBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.prime.Street street = 3;</code>
     */
    public com.studentReader.generated.stubs.Street.Builder getStreetBuilder() {
      
      onChanged();
      return getStreetFieldBuilder().getBuilder();
    }
    /**
     * <code>.prime.Street street = 3;</code>
     */
    public com.studentReader.generated.stubs.StreetOrBuilder getStreetOrBuilder() {
      if (streetBuilder_ != null) {
        return streetBuilder_.getMessageOrBuilder();
      } else {
        return street_ == null ?
            com.studentReader.generated.stubs.Street.getDefaultInstance() : street_;
      }
    }
    /**
     * <code>.prime.Street street = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.studentReader.generated.stubs.Street, com.studentReader.generated.stubs.Street.Builder, com.studentReader.generated.stubs.StreetOrBuilder> 
        getStreetFieldBuilder() {
      if (streetBuilder_ == null) {
        streetBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.studentReader.generated.stubs.Street, com.studentReader.generated.stubs.Street.Builder, com.studentReader.generated.stubs.StreetOrBuilder>(
                getStreet(),
                getParentForChildren(),
                isClean());
        street_ = null;
      }
      return streetBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:prime.Address)
  }

  // @@protoc_insertion_point(class_scope:prime.Address)
  private static final com.studentReader.generated.stubs.Address DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.studentReader.generated.stubs.Address();
  }

  public static com.studentReader.generated.stubs.Address getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Address>
      PARSER = new com.google.protobuf.AbstractParser<Address>() {
    @java.lang.Override
    public Address parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Address(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Address> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Address> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.studentReader.generated.stubs.Address getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

