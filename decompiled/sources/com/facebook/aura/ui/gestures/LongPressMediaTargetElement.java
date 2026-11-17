package com.facebook.aura.ui.gestures;

import X.Ab8;
import X.AbstractC1439Aj8;
import X.C7384Etj;
import X.FGI;

/* loaded from: classes.dex */
public final class LongPressMediaTargetElement extends Ab8<LongPressMediaTargetNode> {
    public final String key;

    public LongPressMediaTargetElement(String str) {
        C7384Etj.A0Y(str, 0);
        this.key = str;
    }

    public final LongPressMediaTargetElement copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new LongPressMediaTargetElement(str);
    }

    @Override // X.Ab8
    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof LongPressMediaTargetElement) && C7384Etj.areEqual(this.key, ((LongPressMediaTargetElement) obj).key));
    }

    @Override // X.Ab8
    public void update(LongPressMediaTargetNode longPressMediaTargetNode) {
        C7384Etj.A0Y(longPressMediaTargetNode, 0);
        longPressMediaTargetNode.setKey(this.key);
    }

    public static /* synthetic */ LongPressMediaTargetElement copy$default(LongPressMediaTargetElement longPressMediaTargetElement, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = longPressMediaTargetElement.key;
        }
        C7384Etj.A0Y(str, 0);
        return new LongPressMediaTargetElement(str);
    }

    public final String component1() {
        return this.key;
    }

    @Override // X.Ab8
    public /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        return new LongPressMediaTargetNode(this.key);
    }

    public final String getKey() {
        return this.key;
    }

    @Override // X.Ab8
    public int hashCode() {
        return this.key.hashCode();
    }

    public String toString() {
        return FGI.A0U("LongPressMediaTargetElement(key=", this.key, ")");
    }

    @Override // X.Ab8
    public LongPressMediaTargetNode create() {
        return new LongPressMediaTargetNode(this.key);
    }
}
