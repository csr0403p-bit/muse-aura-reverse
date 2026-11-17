package com.facebook.graphql.error;

import X.AbstractC7415EvI;
import X.BV4;
import X.BV7;
import X.BWo;
import X.C7580F4t;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.aura.common.url.HatchPeerInviteLinks;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import com.facebook.common.json.AutoGenJsonDeserializer;
import com.facebook.common.json.AutoGenJsonSerializer;
import com.facebook.http.protocol.ApiErrorResult;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.common.base.MoreObjects$ToStringHelper;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableMap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@AutoGenJsonSerializer
@JsonDeserialize(using = GraphQLErrorDeserializer.class)
@JsonSerialize(using = GraphQLErrorSerializer.class)
@AutoGenJsonDeserializer
/* loaded from: classes5.dex */
public class GraphQLError extends ApiErrorResult {
    public static final Parcelable.Creator<GraphQLError> CREATOR = new C7580F4t(17);

    @JsonProperty("api_error_code")
    public final int apiErrorCode;

    @JsonProperty(AuraDeeplinkRouteMapper.CODE_PARAM)
    public final int code;

    @JsonProperty("debug_info")
    public final String debugInfo;

    @JsonProperty(HatchWebPageParserKt.DESCRIPTION)
    public final String description;

    @JsonProperty("fb_request_id")
    public final String fbRequestId;

    @JsonProperty("help_center_id")
    public final long helpCenterId;

    @JsonProperty("is_silent")
    public final boolean isSilent;

    @JsonProperty("is_transient")
    public final boolean isTransient;

    @JsonProperty("query_path")
    public final String queryPath;

    @JsonProperty("requires_reauth")
    public final boolean requiresReauth;

    @JsonProperty("sentry_block_user_info")
    public final ImmutableMap<String, String> sentryBlockUserInfo;

    @JsonProperty("severity")
    public final String severity;

    @JsonProperty("summary")
    public final String summary;

    public final boolean equals(Object obj) {
        if (obj instanceof GraphQLError) {
            if (obj != this) {
                GraphQLError graphQLError = (GraphQLError) obj;
                if (!Objects.equal(Integer.valueOf(this.code), Integer.valueOf(graphQLError.code)) || !Objects.equal(Integer.valueOf(this.apiErrorCode), Integer.valueOf(graphQLError.apiErrorCode)) || !Objects.equal(this.summary, graphQLError.summary) || !Objects.equal(this.description, graphQLError.description) || !Objects.equal(Boolean.valueOf(this.isSilent), Boolean.valueOf(graphQLError.isSilent)) || !Objects.equal(Boolean.valueOf(this.isTransient), Boolean.valueOf(graphQLError.isTransient)) || !Objects.equal(this.fbRequestId, graphQLError.fbRequestId) || !Objects.equal(Boolean.valueOf(this.requiresReauth), Boolean.valueOf(graphQLError.requiresReauth)) || !Objects.equal(this.debugInfo, graphQLError.debugInfo) || !Objects.equal(this.queryPath, graphQLError.queryPath) || !Objects.equal(this.sentryBlockUserInfo, graphQLError.sentryBlockUserInfo) || !Objects.equal(this.severity, graphQLError.severity) || !Objects.equal(Long.valueOf(this.helpCenterId), Long.valueOf(graphQLError.helpCenterId))) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.code), Integer.valueOf(this.apiErrorCode), this.summary, this.description, Boolean.valueOf(this.isSilent), Boolean.valueOf(this.isTransient), this.fbRequestId, Boolean.valueOf(this.requiresReauth), this.debugInfo, this.queryPath, this.sentryBlockUserInfo, this.severity, Long.valueOf(this.helpCenterId)});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.AbstractMap, java.util.LinkedHashMap] */
    public final String toString() {
        MoreObjects$ToStringHelper moreObjects$ToStringHelper = new MoreObjects$ToStringHelper(GraphQLError.class.getSimpleName());
        moreObjects$ToStringHelper.add(AuraDeeplinkRouteMapper.CODE_PARAM, this.code);
        moreObjects$ToStringHelper.add("api_error_code", this.apiErrorCode);
        moreObjects$ToStringHelper.add("summary", this.summary);
        moreObjects$ToStringHelper.add(HatchWebPageParserKt.DESCRIPTION, this.description);
        moreObjects$ToStringHelper.add("is_silent", this.isSilent);
        moreObjects$ToStringHelper.add("requires_reauth", this.requiresReauth);
        moreObjects$ToStringHelper.add("debug_info", this.debugInfo);
        moreObjects$ToStringHelper.add("query_path", this.queryPath);
        ImmutableMap<String, String> immutableMap = this.sentryBlockUserInfo;
        if (immutableMap != null && immutableMap.containsKey("sentry_block_data")) {
            ?? linkedHashMap = new LinkedHashMap(immutableMap);
            linkedHashMap.put("sentry_block_data", HatchPeerInviteLinks.REDACTED_FRAGMENT);
            immutableMap = linkedHashMap;
        }
        moreObjects$ToStringHelper.add("sentry_block_user_info", immutableMap);
        moreObjects$ToStringHelper.add("severity", this.severity);
        moreObjects$ToStringHelper.add("help_center_id", this.helpCenterId);
        return moreObjects$ToStringHelper.toString();
    }

    public GraphQLError(Parcel parcel) {
        super(parcel);
        this.code = parcel.readInt();
        this.apiErrorCode = parcel.readInt();
        this.summary = parcel.readString();
        this.description = parcel.readString();
        this.isSilent = BV7.A1Q(parcel.readInt());
        this.isTransient = BV7.A1Q(parcel.readInt());
        this.fbRequestId = parcel.readString();
        this.requiresReauth = BV7.A1Q(parcel.readInt());
        this.debugInfo = parcel.readString();
        this.queryPath = parcel.readString();
        HashMap mapA0u = BV4.A0u();
        ClassLoader classLoader = ImmutableMap.class.getClassLoader();
        if (Build.VERSION.SDK_INT >= 34) {
            AbstractC7415EvI.A00(parcel, classLoader, mapA0u);
        } else {
            parcel.readMap(mapA0u, classLoader);
        }
        this.sentryBlockUserInfo = ImmutableMap.copyOf((Map) mapA0u);
        this.severity = parcel.readString();
        this.helpCenterId = parcel.readLong();
    }

    @Override // com.facebook.http.protocol.ApiErrorResult, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.code);
        parcel.writeInt(this.apiErrorCode);
        parcel.writeString(this.summary);
        parcel.writeString(this.description);
        parcel.writeInt(this.isSilent ? 1 : 0);
        parcel.writeInt(this.isTransient ? 1 : 0);
        parcel.writeString(this.fbRequestId);
        parcel.writeInt(this.requiresReauth ? 1 : 0);
        parcel.writeString(this.debugInfo);
        parcel.writeString(this.queryPath);
        parcel.writeMap(this.sentryBlockUserInfo);
        parcel.writeString(this.severity);
        parcel.writeLong(this.helpCenterId);
    }

    public GraphQLError(String str, String str2, String str3, String str4, int i, int i2, long j, boolean z, boolean z2, boolean z3) {
        super(BWo.GRAPHQL_KERROR_DOMAIN, str2, str4, null, null, str3, str, i, z2);
        this.code = i;
        this.apiErrorCode = i2;
        this.summary = str;
        this.description = str2;
        this.isSilent = z;
        this.isTransient = z2;
        this.fbRequestId = str3;
        this.requiresReauth = z3;
        this.debugInfo = str4;
        this.queryPath = null;
        this.sentryBlockUserInfo = null;
        this.severity = null;
        this.helpCenterId = j;
    }

    public GraphQLError() {
        this(null, null, null, null, -1, -1, -1L, false, false, false);
    }
}
