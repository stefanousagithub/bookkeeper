// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kv_rpc.proto

package org.apache.bookkeeper.stream.proto.kv.rpc;

public interface RangeRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bookkeeper.proto.kv.rpc.RangeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * key is the first key for the range. If range_end is not given, the request only looks up key.
   * </pre>
   *
   * <code>bytes key = 1;</code>
   * @return The key.
   */
  com.google.protobuf.ByteString getKey();

  /**
   * <pre>
   * range_end is the upper bound on the requested range [key, range_end).
   * If range_end is '&#92;0', the range is all keys &gt;= key.
   * If range_end is key plus one (e.g., "aa"+1 == "ab", "a&#92;xff"+1 == "b"),
   * then the range request gets all keys prefixed with key.
   * If both key and range_end are '&#92;0', then the range request returns all keys.
   * </pre>
   *
   * <code>bytes range_end = 2;</code>
   * @return The rangeEnd.
   */
  com.google.protobuf.ByteString getRangeEnd();

  /**
   * <pre>
   * limit is a limit on the number of keys returned for the request.
   * </pre>
   *
   * <code>int64 limit = 3;</code>
   * @return The limit.
   */
  long getLimit();

  /**
   * <pre>
   * revision is the point-in-time of the key-value store to use for the range.
   * If revision is less or equal to zero, the range is over the newest key-value store.
   * If the revision has been compacted, ErrCompacted is returned as a response.
   * </pre>
   *
   * <code>int64 revision = 4;</code>
   * @return The revision.
   */
  long getRevision();

  /**
   * <pre>
   * sort_order is the order for returned sorted results.
   * </pre>
   *
   * <code>.bookkeeper.proto.kv.rpc.RangeRequest.SortOrder sort_order = 5;</code>
   * @return The enum numeric value on the wire for sortOrder.
   */
  int getSortOrderValue();
  /**
   * <pre>
   * sort_order is the order for returned sorted results.
   * </pre>
   *
   * <code>.bookkeeper.proto.kv.rpc.RangeRequest.SortOrder sort_order = 5;</code>
   * @return The sortOrder.
   */
  org.apache.bookkeeper.stream.proto.kv.rpc.RangeRequest.SortOrder getSortOrder();

  /**
   * <pre>
   * sort_target is the key-value field to use for sorting.
   * </pre>
   *
   * <code>.bookkeeper.proto.kv.rpc.RangeRequest.SortTarget sort_target = 6;</code>
   * @return The enum numeric value on the wire for sortTarget.
   */
  int getSortTargetValue();
  /**
   * <pre>
   * sort_target is the key-value field to use for sorting.
   * </pre>
   *
   * <code>.bookkeeper.proto.kv.rpc.RangeRequest.SortTarget sort_target = 6;</code>
   * @return The sortTarget.
   */
  org.apache.bookkeeper.stream.proto.kv.rpc.RangeRequest.SortTarget getSortTarget();

  /**
   * <pre>
   * serializable sets the range request to use serializable member-local reads.
   * Range requests are linearizable by default; linearizable requests have higher
   * latency and lower throughput than serializable requests but reflect the current
   * consensus of the cluster. For better performance, in exchange for possible stale reads,
   * a serializable range request is served locally without needing to reach consensus
   * with other nodes in the cluster.
   * </pre>
   *
   * <code>bool serializable = 7;</code>
   * @return The serializable.
   */
  boolean getSerializable();

  /**
   * <pre>
   * keys_only when set returns only the keys and not the values.
   * </pre>
   *
   * <code>bool keys_only = 8;</code>
   * @return The keysOnly.
   */
  boolean getKeysOnly();

  /**
   * <pre>
   * count_only when set returns only the count of the keys in the range.
   * </pre>
   *
   * <code>bool count_only = 9;</code>
   * @return The countOnly.
   */
  boolean getCountOnly();

  /**
   * <pre>
   * min_mod_revision is the lower bound for returned key mod revisions; all keys with
   * lesser mod revisions will be filtered away.
   * </pre>
   *
   * <code>int64 min_mod_revision = 10;</code>
   * @return The minModRevision.
   */
  long getMinModRevision();

  /**
   * <pre>
   * max_mod_revision is the upper bound for returned key mod revisions; all keys with
   * greater mod revisions will be filtered away.
   * </pre>
   *
   * <code>int64 max_mod_revision = 11;</code>
   * @return The maxModRevision.
   */
  long getMaxModRevision();

  /**
   * <pre>
   * min_create_revision is the lower bound for returned key create revisions; all keys with
   * lesser create trevisions will be filtered away.
   * </pre>
   *
   * <code>int64 min_create_revision = 12;</code>
   * @return The minCreateRevision.
   */
  long getMinCreateRevision();

  /**
   * <pre>
   * max_create_revision is the upper bound for returned key create revisions; all keys with
   * greater create revisions will be filtered away.
   * </pre>
   *
   * <code>int64 max_create_revision = 13;</code>
   * @return The maxCreateRevision.
   */
  long getMaxCreateRevision();

  /**
   * <pre>
   * header
   * </pre>
   *
   * <code>.bookkeeper.proto.kv.rpc.RoutingHeader header = 99;</code>
   * @return Whether the header field is set.
   */
  boolean hasHeader();
  /**
   * <pre>
   * header
   * </pre>
   *
   * <code>.bookkeeper.proto.kv.rpc.RoutingHeader header = 99;</code>
   * @return The header.
   */
  org.apache.bookkeeper.stream.proto.kv.rpc.RoutingHeader getHeader();
  /**
   * <pre>
   * header
   * </pre>
   *
   * <code>.bookkeeper.proto.kv.rpc.RoutingHeader header = 99;</code>
   */
  org.apache.bookkeeper.stream.proto.kv.rpc.RoutingHeaderOrBuilder getHeaderOrBuilder();
}
