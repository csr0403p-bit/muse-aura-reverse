package com.facebook.aura.checkpoint;

import X.AbstractC3358CGz;
import X.AnonymousClass002;
import X.BLG;
import X.C06H;
import X.C1BN;
import X.C3cG;
import X.C7384Etj;
import X.C7BY;
import X.C9286GCn;
import X.CFK;
import X.FGI;

/* loaded from: classes2.dex */
public final class HatchCheckpointRepository {
    public static final Companion Companion = new Companion();
    public final BLG<HatchCheckpointBlock> _block;
    public final C1BN<HatchCheckpointBlock> block;

    public final void onBlocked(String str) {
        HatchCheckpointBlock value;
        HatchCheckpointBlock hatchCheckpointBlock;
        String strA0r;
        if (str == null || C7BY.A0j(str)) {
            str = null;
        }
        BLG<HatchCheckpointBlock> blg = this._block;
        do {
            value = blg.getValue();
            hatchCheckpointBlock = value;
        } while (!blg.A6e(value, (hatchCheckpointBlock == null || (hatchCheckpointBlock.url == null && str != null)) ? new HatchCheckpointBlock(str) : hatchCheckpointBlock));
        if (hatchCheckpointBlock == null) {
            strA0r = FGI.A0r("checkpoint reported on an authenticated call, url resolved: ", AnonymousClass002.A1X(str));
        } else if (hatchCheckpointBlock.url != null || str == null) {
            return;
        } else {
            strA0r = "checkpoint url resolved by a later refusal";
        }
        CFK.A06(HatchCheckpointRepositoryKt.TAG, strA0r);
    }

    public final void clear() {
        this._block.Af8(null);
    }

    public final C1BN<HatchCheckpointBlock> getBlock() {
        return this.block;
    }

    public final class Companion {
        public final HatchCheckpointRepository getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HatchCheckpointRepository) abstractC3358CGz.A03(HatchCheckpointRepository.class, HatchCheckpointRepository$Companion$getInstance$1.INSTANCE);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public /* synthetic */ HatchCheckpointRepository(C06H c06h) {
        this();
    }

    public HatchCheckpointRepository() {
        C9286GCn c9286GCnA13 = C3cG.A13();
        this._block = c9286GCnA13;
        this.block = C3cG.A11(c9286GCnA13);
    }
}
