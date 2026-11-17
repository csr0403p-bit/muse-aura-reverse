package com.facebook.aura.gateway;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.F0C;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonElement;

@Serializable
/* loaded from: classes2.dex */
public final class OutgoingMediaApprovalJson extends C06G {
    public static final int $stable = 8;
    public final List<JsonElement> items;
    public final String message_text;
    public final String recipient_display;
    public final int version;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1U(C79.A01, null, null, null, OutgoingMediaApprovalJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<OutgoingMediaApprovalJson> serializer() {
            return OutgoingMediaApprovalJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OutgoingMediaApprovalJson(int i, String str, String str2, List<? extends JsonElement> list) {
        C7384Etj.A0Y(list, 3);
        this.version = i;
        this.recipient_display = str;
        this.message_text = str2;
        this.items = list;
    }

    public final OutgoingMediaApprovalJson copy(int i, String str, String str2, List<? extends JsonElement> list) {
        C7384Etj.A0Y(list, 3);
        return new OutgoingMediaApprovalJson(i, str, str2, list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OutgoingMediaApprovalJson) {
                OutgoingMediaApprovalJson outgoingMediaApprovalJson = (OutgoingMediaApprovalJson) obj;
                if (this.version != outgoingMediaApprovalJson.version || !C7384Etj.areEqual(this.recipient_display, outgoingMediaApprovalJson.recipient_display) || !C7384Etj.areEqual(this.message_text, outgoingMediaApprovalJson.message_text) || !C7384Etj.areEqual(this.items, outgoingMediaApprovalJson.items)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ OutgoingMediaApprovalJson copy$default(OutgoingMediaApprovalJson outgoingMediaApprovalJson, int i, String str, String str2, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = outgoingMediaApprovalJson.version;
        }
        if ((i2 & 2) != 0) {
            str = outgoingMediaApprovalJson.recipient_display;
        }
        if ((i2 & 4) != 0) {
            str2 = outgoingMediaApprovalJson.message_text;
        }
        if ((i2 & 8) != 0) {
            list = outgoingMediaApprovalJson.items;
        }
        C7384Etj.A0Y(list, 3);
        return new OutgoingMediaApprovalJson(i, str, str2, list);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(com.facebook.aura.gateway.OutgoingMediaApprovalJson r5, X.C9j5 r6, X.C9iZ r7) {
        /*
            X.F0C<X.9hr<java.lang.Object>>[] r3 = com.facebook.aura.gateway.OutgoingMediaApprovalJson.$childSerializers
            r1 = 0
            boolean r4 = r6.AfR()
            r2 = 1
            if (r4 != 0) goto Le
            int r0 = r5.version
            if (r0 == r2) goto L3f
        Le:
            int r0 = r5.version
            r6.AAK(r7, r1, r0)
            if (r4 == 0) goto L3f
        L15:
            X.9iq r1 = X.C07779iq.A01
            java.lang.String r0 = r5.recipient_display
            r6.AAP(r0, r1, r7, r2)
        L1c:
            r2 = 2
            if (r4 != 0) goto L23
            java.lang.String r0 = r5.message_text
            if (r0 == 0) goto L2a
        L23:
            X.9iq r1 = X.C07779iq.A01
            java.lang.String r0 = r5.message_text
            r6.AAP(r0, r1, r7, r2)
        L2a:
            r2 = 3
            if (r4 != 0) goto L35
            java.util.List<kotlinx.serialization.json.JsonElement> r0 = r5.items
            boolean r0 = X.C3cG.A1L(r0)
            if (r0 != 0) goto L3e
        L35:
            X.9hv r1 = X.C3cH.A15(r3, r2)
            java.util.List<kotlinx.serialization.json.JsonElement> r0 = r5.items
            r6.AAQ(r0, r1, r7, r2)
        L3e:
            return
        L3f:
            java.lang.String r0 = r5.recipient_display
            if (r0 == 0) goto L1c
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.OutgoingMediaApprovalJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(com.facebook.aura.gateway.OutgoingMediaApprovalJson, X.9j5, X.9iZ):void");
    }

    public final int component1() {
        return this.version;
    }

    public final String component2() {
        return this.recipient_display;
    }

    public final String component3() {
        return this.message_text;
    }

    public final List<JsonElement> component4() {
        return this.items;
    }

    public final List<JsonElement> getItems() {
        return this.items;
    }

    public final String getMessage_text() {
        return this.message_text;
    }

    public final String getRecipient_display() {
        return this.recipient_display;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.items, ((((this.version * 31) + AnonymousClass006.A0G(this.recipient_display)) * 31) + AnonymousClass005.A0H(this.message_text)) * 31);
    }

    public final HatchAgentPermissionsRepository.OutgoingMediaApproval toDomain() {
        int i = this.version;
        String str = this.recipient_display;
        String str2 = this.message_text;
        List<JsonElement> list = this.items;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<JsonElement> it = list.iterator();
        while (it.hasNext()) {
            HatchAgentPermissionsRepository.OutgoingMediaItem outgoingMediaItemDecodeOutgoingMediaItem = HatchAgentPermissionsRepositoryJsonKt.decodeOutgoingMediaItem(it.next());
            if (outgoingMediaItemDecodeOutgoingMediaItem != null) {
                arrayListA0h.add(outgoingMediaItemDecodeOutgoingMediaItem);
            }
        }
        return new HatchAgentPermissionsRepository.OutgoingMediaApproval(i, str, str2, arrayListA0h);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ OutgoingMediaApprovalJson(int i, int i2, String str, String str2, List list, C2hx c2hx) {
        this.version = (i & 1) == 0 ? 1 : i2;
        if ((i & 2) == 0) {
            this.recipient_display = null;
        } else {
            this.recipient_display = str;
        }
        if ((i & 4) == 0) {
            this.message_text = null;
        } else {
            this.message_text = str2;
        }
        if ((i & 8) == 0) {
            this.items = C0881AGi.A00;
        } else {
            this.items = list;
        }
    }

    public /* synthetic */ OutgoingMediaApprovalJson(int i, String str, String str2, List list, int i2, C06H c06h) {
        this((i2 & 1) != 0 ? 1 : i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? C0881AGi.A00 : list);
    }

    public OutgoingMediaApprovalJson() {
        this(1, null, null, C0881AGi.A00);
    }
}
