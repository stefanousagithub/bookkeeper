// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stream.proto

package org.apache.bookkeeper.stream.proto;

public interface RetentionPolicyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bookkeeper.proto.stream.RetentionPolicy)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.bookkeeper.proto.stream.TimeBasedRetentionPolicy time_policy = 1;</code>
   * @return Whether the timePolicy field is set.
   */
  boolean hasTimePolicy();
  /**
   * <code>.bookkeeper.proto.stream.TimeBasedRetentionPolicy time_policy = 1;</code>
   * @return The timePolicy.
   */
  org.apache.bookkeeper.stream.proto.TimeBasedRetentionPolicy getTimePolicy();
  /**
   * <code>.bookkeeper.proto.stream.TimeBasedRetentionPolicy time_policy = 1;</code>
   */
  org.apache.bookkeeper.stream.proto.TimeBasedRetentionPolicyOrBuilder getTimePolicyOrBuilder();
}
