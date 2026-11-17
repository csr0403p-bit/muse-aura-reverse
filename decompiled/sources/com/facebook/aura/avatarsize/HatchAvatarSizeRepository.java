package com.facebook.aura.avatarsize;

import X.AbstractC3358CGz;
import X.AnonymousClass002;
import X.BLG;
import X.BzK;
import X.C06H;
import X.C1BN;
import X.C3Pi;
import X.C4oT;
import X.C7384Etj;
import X.C9286GCn;
import X.HnJ;
import X.InterfaceC7549F2g;
import com.facebook.aura.avatarsize.HatchAvatarSize;
import com.facebook.aura.common.prefs.AuraVMPrefStore;
import com.facebook.aura.common.prefs.AuraVMPrefs;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;

/* loaded from: classes.dex */
public final class HatchAvatarSizeRepository implements InterfaceC7549F2g {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public static final String KEY_AVATAR_SIZE = "avatar_size";
    public final BLG<HatchAvatarSize> _avatarSize;
    public final C1BN<HatchAvatarSize> avatarSize;
    public String loadedVmId;
    public final AbstractC3358CGz userSession;

    public final void setAvatarSize(HatchAvatarSize hatchAvatarSize) {
        C7384Etj.A0Y(hatchAvatarSize, 0);
        this.loadedVmId = getVmId();
        BzK bzKA9q = getPrefs().A9q();
        bzKA9q.AYr(KEY_AVATAR_SIZE, hatchAvatarSize.getStoredValue());
        bzKA9q.apply();
        AnonymousClass002.A1I(this._avatarSize, hatchAvatarSize);
    }

    private final C4oT getPrefs() {
        return AuraVMPrefs.INSTANCE.get(getVmId(), AuraVMPrefStore.APPEARANCE);
    }

    private final String getVmId() {
        return HatchGatewayPrefsStore.Companion.getInstance(this.userSession).getHatcheryVMId();
    }

    public final C1BN<HatchAvatarSize> getAvatarSize() {
        return this.avatarSize;
    }

    public final class Companion {
        public final HatchAvatarSizeRepository getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HatchAvatarSizeRepository) abstractC3358CGz.A03(HatchAvatarSizeRepository.class, new HatchAvatarSizeRepository$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public /* synthetic */ HatchAvatarSizeRepository(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }

    private final HatchAvatarSize load() {
        String string = getPrefs().getString(KEY_AVATAR_SIZE, null);
        HatchAvatarSize.Companion companion = HatchAvatarSize.Companion;
        if (string == null) {
            string = HatchAvatarSizeMC.INSTANCE.getDefaultAvatarSize();
        }
        return companion.fromStoredValue(string);
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        BzK bzKA9q = getPrefs().A9q();
        bzKA9q.Aae(KEY_AVATAR_SIZE);
        bzKA9q.apply();
        this._avatarSize.Af8(load());
    }

    public final void syncFromPrefs() {
        String vmId = getVmId();
        if (C7384Etj.areEqual(vmId, this.loadedVmId)) {
            return;
        }
        this.loadedVmId = vmId;
        this._avatarSize.Af8(load());
    }

    public HatchAvatarSizeRepository(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        this.loadedVmId = getVmId();
        C9286GCn c9286GCnA01 = HnJ.A01(load());
        this._avatarSize = c9286GCnA01;
        this.avatarSize = C3Pi.A00(c9286GCnA01);
    }
}
