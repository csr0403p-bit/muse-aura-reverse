package com.facebook.aura.conversation.data;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;
import X.FGI;

/* loaded from: classes3.dex */
public final class ChatHistoryFetchFailure extends C06G implements ChatHistoryFetchResult {
    public final String detail;
    public final Integer httpStatusCode;
    public final String reason;

    public ChatHistoryFetchFailure(String str, Integer num, String str2) {
        C7384Etj.A0Y(str, 0);
        this.reason = str;
        this.httpStatusCode = num;
        this.detail = str2;
    }

    public final ChatHistoryFetchFailure copy(String str, Integer num, String str2) {
        C7384Etj.A0Y(str, 0);
        return new ChatHistoryFetchFailure(str, num, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ChatHistoryFetchFailure) {
                ChatHistoryFetchFailure chatHistoryFetchFailure = (ChatHistoryFetchFailure) obj;
                if (!C7384Etj.areEqual(this.reason, chatHistoryFetchFailure.reason) || !C7384Etj.areEqual(this.httpStatusCode, chatHistoryFetchFailure.httpStatusCode) || !C7384Etj.areEqual(this.detail, chatHistoryFetchFailure.detail)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ChatHistoryFetchFailure copy$default(ChatHistoryFetchFailure chatHistoryFetchFailure, String str, Integer num, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatHistoryFetchFailure.reason;
        }
        if ((i & 2) != 0) {
            num = chatHistoryFetchFailure.httpStatusCode;
        }
        if ((i & 4) != 0) {
            str2 = chatHistoryFetchFailure.detail;
        }
        return chatHistoryFetchFailure.copy(str, num, str2);
    }

    public final String component1() {
        return this.reason;
    }

    public final Integer component2() {
        return this.httpStatusCode;
    }

    public final String component3() {
        return this.detail;
    }

    public final String getDetail() {
        return this.detail;
    }

    public final Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public final String getLogValue() {
        String str = this.detail;
        return str != null ? FGI.A0U(getQplValue(), " detail=", str) : getQplValue();
    }

    public final String getQplValue() {
        Integer num = this.httpStatusCode;
        if (num == null) {
            return this.reason;
        }
        return FGI.A0S(this.reason, ":", num.intValue());
    }

    public final String getReason() {
        return this.reason;
    }

    public int hashCode() {
        return ((AnonymousClass001.A0G(this.reason) + AnonymousClass006.A0D(this.httpStatusCode)) * 31) + AnonymousClass005.A0H(this.detail);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ChatHistoryFetchFailure(String str, Integer num, String str2, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2);
    }
}
