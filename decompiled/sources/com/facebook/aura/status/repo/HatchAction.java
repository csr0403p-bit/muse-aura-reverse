package com.facebook.aura.status.repo;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes4.dex */
public final class HatchAction extends C06G {
    public final String id;
    public final List<TextPart> textParts;
    public final String workMessage;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchAction) {
                HatchAction hatchAction = (HatchAction) obj;
                if (!C7384Etj.areEqual(this.id, hatchAction.id) || !C7384Etj.areEqual(this.textParts, hatchAction.textParts) || !C7384Etj.areEqual(this.workMessage, hatchAction.workMessage)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HatchAction copy$default(HatchAction hatchAction, String str, List list, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchAction.id;
        }
        if ((i & 2) != 0) {
            list = hatchAction.textParts;
        }
        if ((i & 4) != 0) {
            str2 = hatchAction.workMessage;
        }
        return hatchAction.copy(str, list, str2);
    }

    public final String component1() {
        return this.id;
    }

    public final List<TextPart> component2() {
        return this.textParts;
    }

    public final String component3() {
        return this.workMessage;
    }

    public final String getId() {
        return this.id;
    }

    public final List<TextPart> getTextParts() {
        return this.textParts;
    }

    public final String getWorkMessage() {
        return this.workMessage;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.workMessage, AnonymousClass005.A0F(this.textParts, AnonymousClass001.A0G(this.id)));
    }

    public HatchAction(String str, List<TextPart> list, String str2) {
        AnonymousClass005.A0x(str, list, str2);
        this.id = str;
        this.textParts = list;
        this.workMessage = str2;
    }

    public final HatchAction copy(String str, List<TextPart> list, String str2) {
        AnonymousClass005.A0x(str, list, str2);
        return new HatchAction(str, list, str2);
    }

    public String toString() {
        return super.toString();
    }
}
