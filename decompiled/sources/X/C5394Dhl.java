package X;

import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.UnsupportedSchemeException;
import android.os.Build;
import androidx.media3.exoplayer.drm.UnsupportedDrmException;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.Dhl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5394Dhl implements InterfaceC6174DxH {
    public static final InterfaceC2393BYv A03 = new InterfaceC2393BYv() { // from class: X.Be9
        @Override // X.InterfaceC2393BYv
        public final InterfaceC6174DxH A2z(UUID uuid) throws UnsupportedDrmException {
            try {
                try {
                    return new C5394Dhl(uuid);
                } catch (UnsupportedSchemeException e) {
                    throw new UnsupportedDrmException(e, 1);
                } catch (Exception e2) {
                    throw new UnsupportedDrmException(e2, 2);
                }
            } catch (UnsupportedDrmException unused) {
                CNC.A02("FrameworkMediaDrm", AnonymousClass001.A0v(".", C3cG.A0f(uuid, "Failed to instantiate a FrameworkMediaDrm for uuid: ")));
                return new C5391Dhi();
            }
        }
    };
    public int A00;
    public final MediaDrm A01;
    public final UUID A02;

    /* JADX WARN: Incorrect types in method signature: ([BLjava/util/List<Landroidx/media3/common/DrmInitData$SchemeData;>;ILjava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;)LX/CMr; */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ec  */
    @Override // X.InterfaceC6174DxH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C3425CMr AGp(java.util.HashMap r16, java.util.List r17, byte[] r18, int r19) throws android.media.NotProvisionedException {
        /*
            Method dump skipped, instructions count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5394Dhl.AGp(java.util.HashMap, java.util.List, byte[], int):X.CMr");
    }

    @Override // X.InterfaceC6174DxH
    public final synchronized void release() {
        int i = this.A00 - 1;
        this.A00 = i;
        if (i == 0) {
            try {
                this.A01.release();
            } catch (NullPointerException e) {
                CNC.A06("FrameworkMediaDrm", "MediaDrm.release() failed", e);
            }
        }
    }

    private boolean A00() {
        UUID uuid = this.A02;
        if (!uuid.equals(AbstractC5400Dhr.A04)) {
            return uuid.equals(AbstractC5400Dhr.A00);
        }
        String propertyString = this.A01.getPropertyString("version");
        return (propertyString.startsWith("v5.") || propertyString.startsWith("14.") || propertyString.startsWith("15.") || propertyString.startsWith("16.0")) ? false : true;
    }

    @Override // X.InterfaceC6174DxH
    public final void A6S(byte[] bArr) {
        this.A01.closeSession(bArr);
    }

    @Override // X.InterfaceC6174DxH
    public final /* bridge */ /* synthetic */ InterfaceC5392Dhj A7g(byte[] bArr) {
        return new C5396Dhn(this.A02, bArr);
    }

    @Override // X.InterfaceC6174DxH
    public final int AEG() {
        return 2;
    }

    @Override // X.InterfaceC6174DxH
    public final CMp AJF() {
        MediaDrm.ProvisionRequest provisionRequest = this.A01.getProvisionRequest();
        return new CMp(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // X.InterfaceC6174DxH
    public final byte[] AXX() {
        return this.A01.openSession();
    }

    @Override // X.InterfaceC6174DxH
    public final byte[] AYf(byte[] bArr, byte[] bArr2) {
        UUID uuid = AbstractC5400Dhr.A04;
        return this.A01.provideKeyResponse(bArr, bArr2);
    }

    @Override // X.InterfaceC6174DxH
    public final void AYg(byte[] bArr) throws DeniedByServerException {
        this.A01.provideProvisionResponse(bArr);
    }

    @Override // X.InterfaceC6174DxH
    public final Map<String, String> AYv(byte[] bArr) {
        return this.A01.queryKeyStatus(bArr);
    }

    @Override // X.InterfaceC6174DxH
    public final boolean AbI(byte[] bArr, String str) throws Throwable {
        MediaCrypto mediaCrypto;
        if (Build.VERSION.SDK_INT >= 31 && A00()) {
            MediaDrm mediaDrm = this.A01;
            return AbstractC5397Dho.A01(mediaDrm, str, mediaDrm.getSecurityLevel(bArr));
        }
        MediaCrypto mediaCrypto2 = null;
        try {
            try {
                mediaCrypto = new MediaCrypto(this.A02, bArr);
            } catch (Throwable th) {
                th = th;
                if (mediaCrypto2 == null) {
                    throw th;
                }
            }
        } catch (MediaCryptoException unused) {
        }
        try {
            boolean zRequiresSecureDecoderComponent = mediaCrypto.requiresSecureDecoderComponent(str);
            mediaCrypto.release();
            return zRequiresSecureDecoderComponent;
        } catch (MediaCryptoException unused2) {
            mediaCrypto2 = mediaCrypto;
            boolean z = !this.A02.equals(AbstractC5400Dhr.A00);
            if (mediaCrypto2 == null) {
                return z;
            }
            mediaCrypto2.release();
            return z;
        } catch (Throwable th2) {
            th = th2;
            mediaCrypto2 = mediaCrypto;
            mediaCrypto2.release();
            throw th;
        }
    }

    @Override // X.InterfaceC6174DxH
    public final void Abd(byte[] bArr, byte[] bArr2) {
        this.A01.restoreKeys(bArr, bArr2);
    }

    @Override // X.InterfaceC6174DxH
    public final void Adt(final InterfaceC5393Dhk interfaceC5393Dhk) {
        this.A01.setOnEventListener(interfaceC5393Dhk == null ? null : new MediaDrm.OnEventListener() { // from class: X.Dhm
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
                HandlerC6186DxU handlerC6186DxU = ((C5398Dhp) interfaceC5393Dhk).A00.A0I;
                handlerC6186DxU.getClass();
                BV6.A10(handlerC6186DxU, bArr, i);
            }
        });
    }

    @Override // X.InterfaceC6174DxH
    public final void Ae7(E6Y e6y, byte[] bArr) {
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                AbstractC5397Dho.A00(this.A01, e6y, bArr);
            } catch (UnsupportedOperationException unused) {
                CNC.A04("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // X.InterfaceC6174DxH
    public final void AeI(String str, String str2) {
        this.A01.setPropertyString(str, str2);
    }

    public C5394Dhl(UUID uuid) {
        uuid.getClass();
        C1G.A09(!AbstractC5400Dhr.A01.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.A02 = uuid;
        MediaDrm mediaDrm = new MediaDrm(uuid);
        this.A01 = mediaDrm;
        this.A00 = 1;
        if (AbstractC5400Dhr.A04.equals(uuid) && "ASUS_Z00AD".equals(Build.MODEL)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    public static byte[] A01(UUID uuid, byte[] bArr) {
        C5399Dhq c5399DhqA00 = AbstractC5508Djk.A00(bArr);
        if (c5399DhqA00 != null) {
            UUID uuid2 = c5399DhqA00.A01;
            if (uuid.equals(uuid2)) {
                return c5399DhqA00.A02;
            }
            StringBuilder sbA0f = C3cG.A0f(uuid, "UUID mismatch. Expected: ");
            sbA0f.append(", got: ");
            sbA0f.append(uuid2);
            CNC.A04("PsshAtomUtil", AnonymousClass001.A0v(".", sbA0f));
        }
        return null;
    }
}
