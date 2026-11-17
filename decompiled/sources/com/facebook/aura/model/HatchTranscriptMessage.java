package com.facebook.aura.model;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.F60;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class HatchTranscriptMessage extends C06G {
    public static final int $stable = 8;
    public final List<HatchContentBlock> content;
    public final long createdAtMs;
    public final String id;
    public final String role;
    public final String status;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, AbstractC5321DgF.A02(C79.A01, HatchTranscriptMessage$Companion$$childSerializers$1.INSTANCE), null, null};

    public final class Companion {
        public final C9hr<HatchTranscriptMessage> serializer() {
            return HatchTranscriptMessage$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchTranscriptMessage) {
                HatchTranscriptMessage hatchTranscriptMessage = (HatchTranscriptMessage) obj;
                if (!C7384Etj.areEqual(this.id, hatchTranscriptMessage.id) || !C7384Etj.areEqual(this.role, hatchTranscriptMessage.role) || !C7384Etj.areEqual(this.content, hatchTranscriptMessage.content) || !C7384Etj.areEqual(this.status, hatchTranscriptMessage.status) || this.createdAtMs != hatchTranscriptMessage.createdAtMs) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HatchTranscriptMessage copy$default(HatchTranscriptMessage hatchTranscriptMessage, String str, String str2, List list, String str3, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchTranscriptMessage.id;
        }
        if ((i & 2) != 0) {
            str2 = hatchTranscriptMessage.role;
        }
        if ((i & 4) != 0) {
            list = hatchTranscriptMessage.content;
        }
        if ((i & 8) != 0) {
            str3 = hatchTranscriptMessage.status;
        }
        if ((i & 16) != 0) {
            j = hatchTranscriptMessage.createdAtMs;
        }
        return hatchTranscriptMessage.copy(str, str2, list, str3, j);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(HatchTranscriptMessage hatchTranscriptMessage, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(hatchTranscriptMessage.id, c9iZ, 0);
        c9j5.AAV(hatchTranscriptMessage.role, c9iZ, 1);
        c9j5.AAQ(hatchTranscriptMessage.content, C3cH.A15(f0cArr, 2), c9iZ, 2);
        c9j5.AAV(hatchTranscriptMessage.status, c9iZ, 3);
        c9j5.AAN(c9iZ, 4, hatchTranscriptMessage.createdAtMs);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.role;
    }

    public final List<HatchContentBlock> component3() {
        return this.content;
    }

    public final String component4() {
        return this.status;
    }

    public final long component5() {
        return this.createdAtMs;
    }

    public final List<HatchContentBlock> getContent() {
        return this.content;
    }

    public final long getCreatedAtMs() {
        return this.createdAtMs;
    }

    public final String getId() {
        return this.id;
    }

    public final String getRole() {
        return this.role;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return AnonymousClass006.A05(this.createdAtMs, AnonymousClass005.A0I(this.status, AnonymousClass005.A0F(this.content, AnonymousClass005.A0I(this.role, AnonymousClass001.A0G(this.id)))));
    }

    public HatchTranscriptMessage(String str, String str2, List<HatchContentBlock> list, String str3, long j) {
        AnonymousClass005.A14(str, str2, list, str3);
        this.id = str;
        this.role = str2;
        this.content = list;
        this.status = str3;
        this.createdAtMs = j;
    }

    public final HatchTranscriptMessage copy(String str, String str2, List<HatchContentBlock> list, String str3, long j) {
        AnonymousClass005.A14(str, str2, list, str3);
        return new HatchTranscriptMessage(str, str2, list, str3, j);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchTranscriptMessage(int i, String str, String str2, List list, String str3, long j, C2hx c2hx) {
        if (31 != (i & 31)) {
            C9iI.A00(HatchTranscriptMessage$$serializer.descriptor, i, 31);
            throw F60.createAndThrow();
        }
        this.id = str;
        this.role = str2;
        this.content = list;
        this.status = str3;
        this.createdAtMs = j;
    }
}
