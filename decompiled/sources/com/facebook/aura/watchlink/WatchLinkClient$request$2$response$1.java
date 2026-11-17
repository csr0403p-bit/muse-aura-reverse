package com.facebook.aura.watchlink;

import X.AbstractC07127nr;
import X.AbstractC3001Brc;
import X.AbstractC4178Com;
import X.AbstractC4267Crq;
import X.AnonymousClass001;
import X.C3UX;
import X.C4231Cqf;
import X.C4232Cqg;
import X.C4234Cqv;
import X.C4276Cs4;
import X.C4278Cs8;
import X.CSC;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.InterfaceC4375CuV;
import android.content.Context;
import android.os.Parcel;
import com.facebook.aura.composer.util.ImageCompressor;
import com.google.android.gms.internal.wearable.zza;
import com.google.android.gms.internal.wearable.zzb;
import com.google.android.gms.wearable.internal.zzjd;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.watchlink.WatchLinkClient$request$2$response$1", f = "WatchLinkClient.kt", l = {ImageCompressor.IMAGE_COMPRESSION_QUALITY}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class WatchLinkClient$request$2$response$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super byte[]>, Object> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ String $nodeId;
    public final /* synthetic */ String $path;
    public final /* synthetic */ byte[] $payload;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatchLinkClient$request$2$response$1(Context context, String str, String str2, byte[] bArr, HtJ<? super WatchLinkClient$request$2$response$1> htJ) {
        super(2, htJ);
        this.$context = context;
        this.$nodeId = str;
        this.$path = str2;
        this.$payload = bArr;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new WatchLinkClient$request$2$response$1(this.$context, this.$nodeId, this.$path, this.$payload, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            Context context = this.$context;
            C4276Cs4 c4276Cs4 = C4276Cs4.A02;
            final C4234Cqv c4234Cqv = new C4234Cqv(context, C4278Cs8.A00, AbstractC4267Crq.A00, c4276Cs4);
            final String str = this.$nodeId;
            final String str2 = this.$path;
            final byte[] bArr = this.$payload;
            C4231Cqf c4231CqfA00 = C4232Cqg.A00();
            c4231CqfA00.A01 = new InterfaceC4375CuV() { // from class: X.Cn4
                @Override // X.InterfaceC4375CuV
                public final void accept(Object obj2, Object obj3) {
                    String str3 = str;
                    String str4 = str2;
                    byte[] bArr2 = bArr;
                    Cn5 cn5 = new Cn5((CSE) obj3);
                    zza zzaVar = (zza) ((AbstractC4160CoH) obj2).A03();
                    Parcel parcelA00 = zzb.A00(cn5, zzaVar, new zzjd());
                    parcelA00.writeString(str3);
                    parcelA00.writeString(str4);
                    parcelA00.writeByteArray(bArr2);
                    zzaVar.A00(parcelA00, 58);
                }
            };
            c4231CqfA00.A00 = 24006;
            CSC cscA02 = AbstractC4178Com.A02(c4234Cqv, c4231CqfA00.A00(), 0);
            this.label = 1;
            obj = AbstractC3001Brc.A00(cscA02, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return obj;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super byte[]> htJ) {
        return ((WatchLinkClient$request$2$response$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
