package com.facebook.aura.commands.sms;

import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C3cH;
import X.C7384Etj;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.JsonElement;

/* loaded from: classes3.dex */
public interface MessageRecipientOutcome {

    public final class Failed extends C06G implements MessageRecipientOutcome {
        public final String errorCode;
        public final Map<String, JsonElement> extras;
        public final String message;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Failed copy$default(Failed failed, String str, String str2, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                str = failed.message;
            }
            if ((i & 2) != 0) {
                str2 = failed.errorCode;
            }
            if ((i & 4) != 0) {
                map = failed.extras;
            }
            return failed.copy(str, str2, map);
        }

        public final String component1() {
            return this.message;
        }

        public final String component2() {
            return this.errorCode;
        }

        public final Map<String, JsonElement> component3() {
            return this.extras;
        }

        public final String getErrorCode() {
            return this.errorCode;
        }

        public final Map<String, JsonElement> getExtras() {
            return this.extras;
        }

        public final String getMessage() {
            return this.message;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Failed(String str, String str2, Map<String, ? extends JsonElement> map) {
            AnonymousClass005.A0x(str, str2, map);
            this.message = str;
            this.errorCode = str2;
            this.extras = map;
        }

        public final Failed copy(String str, String str2, Map<String, ? extends JsonElement> map) {
            AnonymousClass005.A0x(str, str2, map);
            return new Failed(str, str2, map);
        }

        public boolean equals(Object obj) {
            return super.equals(obj);
        }

        public int hashCode() {
            return super.hashCode();
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ Failed(String str, String str2, Map map, int i, C06H c06h) {
            this(str, str2, C3cH.A0o(map, i & 4));
        }
    }

    public final class Ready extends C06G implements MessageRecipientOutcome {
        public final List<MessagingRecipientArg> cardRecipients;

        public Ready(List<MessagingRecipientArg> list) {
            C7384Etj.A0Y(list, 0);
            this.cardRecipients = list;
        }

        public final Ready copy(List<MessagingRecipientArg> list) {
            C7384Etj.A0Y(list, 0);
            return new Ready(list);
        }

        public static /* synthetic */ Ready copy$default(Ready ready, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = ready.cardRecipients;
            }
            C7384Etj.A0Y(list, 0);
            return new Ready(list);
        }

        public final List<MessagingRecipientArg> component1() {
            return this.cardRecipients;
        }

        public final List<MessagingRecipientArg> getCardRecipients() {
            return this.cardRecipients;
        }

        public boolean equals(Object obj) {
            return super.equals(obj);
        }

        public int hashCode() {
            return super.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }
}
