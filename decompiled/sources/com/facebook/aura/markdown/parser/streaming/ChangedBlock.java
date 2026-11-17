package com.facebook.aura.markdown.parser.streaming;

import X.AnonymousClass005;
import X.C3cJ;
import X.C60O;
import X.C7384Etj;
import com.facebook.aura.markdown.parser.ast.AuraBlock;

/* loaded from: classes4.dex */
public final class ChangedBlock {
    public final AuraBlock block;
    public final int index;

    public ChangedBlock(int i, AuraBlock auraBlock) {
        C7384Etj.A0Y(auraBlock, 1);
        this.index = i;
        this.block = auraBlock;
    }

    public final ChangedBlock copy(int i, AuraBlock auraBlock) {
        C7384Etj.A0Y(auraBlock, 1);
        return new ChangedBlock(i, auraBlock);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ChangedBlock) {
                ChangedBlock changedBlock = (ChangedBlock) obj;
                if (this.index != changedBlock.index || !C7384Etj.areEqual(this.block, changedBlock.block)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ChangedBlock copy$default(ChangedBlock changedBlock, int i, AuraBlock auraBlock, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = changedBlock.index;
        }
        if ((i2 & 2) != 0) {
            auraBlock = changedBlock.block;
        }
        C7384Etj.A0Y(auraBlock, 1);
        return new ChangedBlock(i, auraBlock);
    }

    public final int component1() {
        return this.index;
    }

    public final AuraBlock component2() {
        return this.block;
    }

    public final AuraBlock getBlock() {
        return this.block;
    }

    public final int getIndex() {
        return this.index;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.block, this.index * 31);
    }

    public String toString() {
        return C3cJ.A0L(this.block, ", block=", C60O.A0y("ChangedBlock(index=", this.index));
    }
}
