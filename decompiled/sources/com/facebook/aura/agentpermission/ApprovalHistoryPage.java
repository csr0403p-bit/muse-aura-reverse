package com.facebook.aura.agentpermission;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.List;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonElement;

@Serializable
/* loaded from: classes2.dex */
public final class ApprovalHistoryPage extends C06G {
    public static final int $stable = 8;
    public final List<JsonElement> items;
    public final String nextCursor;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1X(C79.A01, ApprovalHistoryPage$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<ApprovalHistoryPage> serializer() {
            return ApprovalHistoryPage$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ApprovalHistoryPage(List<? extends JsonElement> list, String str) {
        C7384Etj.A0Y(list, 0);
        this.items = list;
        this.nextCursor = str;
    }

    public final ApprovalHistoryPage copy(List<? extends JsonElement> list, String str) {
        C7384Etj.A0Y(list, 0);
        return new ApprovalHistoryPage(list, str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ApprovalHistoryPage) {
                ApprovalHistoryPage approvalHistoryPage = (ApprovalHistoryPage) obj;
                if (!C7384Etj.areEqual(this.items, approvalHistoryPage.items) || !C7384Etj.areEqual(this.nextCursor, approvalHistoryPage.nextCursor)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ApprovalHistoryPage copy$default(ApprovalHistoryPage approvalHistoryPage, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = approvalHistoryPage.items;
        }
        if ((i & 2) != 0) {
            str = approvalHistoryPage.nextCursor;
        }
        C7384Etj.A0Y(list, 0);
        return new ApprovalHistoryPage(list, str);
    }

    public static /* synthetic */ void getNextCursor$annotations() {
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_agentpermission_repository_repository(ApprovalHistoryPage approvalHistoryPage, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cG.A1L(approvalHistoryPage.items)) {
            c9j5.AAQ(approvalHistoryPage.items, C3cH.A15(f0cArr, 0), c9iZ, 0);
        }
        if (zAfR || approvalHistoryPage.nextCursor != null) {
            c9j5.AAP(approvalHistoryPage.nextCursor, C07779iq.A01, c9iZ, 1);
        }
    }

    public final List<JsonElement> component1() {
        return this.items;
    }

    public final String component2() {
        return this.nextCursor;
    }

    public final List<JsonElement> getItems() {
        return this.items;
    }

    public final String getNextCursor() {
        return this.nextCursor;
    }

    public int hashCode() {
        return AnonymousClass005.A0E(this.items) + AnonymousClass006.A0G(this.nextCursor);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ApprovalHistoryPage(int i, List list, String str, C2hx c2hx) {
        this.items = (i & 1) == 0 ? C0881AGi.A00 : list;
        if ((i & 2) == 0) {
            this.nextCursor = null;
        } else {
            this.nextCursor = str;
        }
    }

    public /* synthetic */ ApprovalHistoryPage(List list, String str, int i, C06H c06h) {
        this(C3cI.A10(list, i), AnonymousClass006.A0s(i, str));
    }

    public ApprovalHistoryPage() {
        this(C0881AGi.A00, null);
    }
}
