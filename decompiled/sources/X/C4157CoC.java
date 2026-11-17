package X;

import android.app.PendingIntent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.facebook.aura.commands.sms.MessageDraftSenderKt;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException;
import com.google.android.gms.common.internal.zat;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zag;
import com.google.android.gms.signin.internal.zai;
import com.google.android.gms.signin.internal.zak;
import com.google.android.gms.wearable.AppTheme;
import com.google.android.gms.wearable.ConnectionConfiguration;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
import com.google.android.gms.wearable.internal.zzas;
import com.google.android.gms.wearable.internal.zzb;
import com.google.android.gms.wearable.internal.zzbj;
import com.google.android.gms.wearable.internal.zzbu;
import com.google.android.gms.wearable.internal.zzca;
import com.google.android.gms.wearable.internal.zzcc;
import com.google.android.gms.wearable.internal.zzcg;
import com.google.android.gms.wearable.internal.zzcj;
import com.google.android.gms.wearable.internal.zzcl;
import com.google.android.gms.wearable.internal.zzdo;
import com.google.android.gms.wearable.internal.zzdr;
import com.google.android.gms.wearable.internal.zzdt;
import com.google.android.gms.wearable.internal.zzdv;
import com.google.android.gms.wearable.internal.zzdx;
import com.google.android.gms.wearable.internal.zzdz;
import com.google.android.gms.wearable.internal.zzeb;
import com.google.android.gms.wearable.internal.zzed;
import com.google.android.gms.wearable.internal.zzef;
import com.google.android.gms.wearable.internal.zzei;
import com.google.android.gms.wearable.internal.zzek;
import com.google.android.gms.wearable.internal.zzem;
import com.google.android.gms.wearable.internal.zzen;
import com.google.android.gms.wearable.internal.zzep;
import com.google.android.gms.wearable.internal.zzer;
import com.google.android.gms.wearable.internal.zzet;
import com.google.android.gms.wearable.internal.zzev;
import com.google.android.gms.wearable.internal.zzex;
import com.google.android.gms.wearable.internal.zzez;
import com.google.android.gms.wearable.internal.zzf;
import com.google.android.gms.wearable.internal.zzfb;
import com.google.android.gms.wearable.internal.zzfd;
import com.google.android.gms.wearable.internal.zzff;
import com.google.android.gms.wearable.internal.zzfh;
import com.google.android.gms.wearable.internal.zzfj;
import com.google.android.gms.wearable.internal.zzgp;
import com.google.android.gms.wearable.internal.zzh;
import com.google.android.gms.wearable.internal.zzhf;
import com.google.android.gms.wearable.internal.zzhg;
import com.google.android.gms.wearable.internal.zzhi;
import com.google.android.gms.wearable.internal.zzhk;
import com.google.android.gms.wearable.internal.zzhm;
import com.google.android.gms.wearable.internal.zzho;
import com.google.android.gms.wearable.internal.zzhs;
import com.google.android.gms.wearable.internal.zzhu;
import com.google.android.gms.wearable.internal.zzhw;
import com.google.android.gms.wearable.internal.zzhy;
import com.google.android.gms.wearable.internal.zzic;
import com.google.android.gms.wearable.internal.zzjs;
import com.google.android.gms.wearable.internal.zzk;
import com.google.android.gms.wearable.internal.zzn;
import com.google.android.gms.wearable.internal.zzq;
import com.google.android.gms.wearable.internal.zzs;
import com.google.android.gms.wearable.internal.zzu;
import com.google.android.gms.wearable.internal.zzx;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.zza;
import com.google.firebase.iid.zzm;
import com.google.firebase.messaging.RemoteMessage;
import com.meta.foa.cds.CdsBottomSheetDimmingBehaviour;
import com.meta.foa.cds.CdsBottomSheetTopSpan;
import com.meta.foa.cds.CdsOpenScreenConfig$BottomSheetMargins;
import java.util.ArrayList;
import org.maplibre.android.R;

/* renamed from: X.CoC, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4157CoC implements Parcelable.Creator {
    public final int $t;

    public C4157CoC(int i) {
        this.$t = i;
    }

    public static C4157CoC A00(int i) {
        return new C4157CoC(i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        switch (this.$t) {
            case 0:
                int iA00 = AbstractC4159CoF.A00(parcel);
                ArrayList<String> arrayListA0B = null;
                String strA0A = null;
                while (parcel.dataPosition() < iA00) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c != 1) {
                        strA0A = AbstractC4159CoF.A0A(parcel, strA0A, c, 2, i);
                    } else {
                        arrayListA0B = AbstractC4159CoF.A0B(parcel, i);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA00);
                return new zag(arrayListA0B, strA0A);
            case 1:
                int iA002 = AbstractC4159CoF.A00(parcel);
                zat zatVar = null;
                int iA02 = 0;
                while (parcel.dataPosition() < iA002) {
                    int i2 = parcel.readInt();
                    char c2 = (char) i2;
                    if (c2 == 1) {
                        iA02 = AbstractC4159CoF.A02(parcel, i2);
                    } else if (c2 != 2) {
                        AbstractC4159CoF.A0E(parcel, i2);
                    } else {
                        zatVar = (zat) AbstractC4159CoF.A08(parcel, zat.CREATOR, i2);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA002);
                return new zai(zatVar, iA02);
            case 2:
                int iA003 = AbstractC4159CoF.A00(parcel);
                ConnectionResult connectionResult = null;
                zav zavVar = null;
                int iA022 = 0;
                while (parcel.dataPosition() < iA003) {
                    int i3 = parcel.readInt();
                    char c3 = (char) i3;
                    if (c3 == 1) {
                        iA022 = AbstractC4159CoF.A02(parcel, i3);
                    } else if (c3 == 2) {
                        connectionResult = (ConnectionResult) AbstractC4159CoF.A08(parcel, ConnectionResult.CREATOR, i3);
                    } else if (c3 != 3) {
                        AbstractC4159CoF.A0E(parcel, i3);
                    } else {
                        zavVar = (zav) AbstractC4159CoF.A08(parcel, zav.CREATOR, i3);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA003);
                return new zak(connectionResult, zavVar, iA022);
            case 3:
                int iA004 = AbstractC4159CoF.A00(parcel);
                String strA09 = null;
                ArrayList arrayListA0C = null;
                while (parcel.dataPosition() < iA004) {
                    int i4 = parcel.readInt();
                    char c4 = (char) i4;
                    if (c4 == 2) {
                        strA09 = AbstractC4159CoF.A09(parcel, i4);
                    } else if (c4 != 3) {
                        AbstractC4159CoF.A0E(parcel, i4);
                    } else {
                        arrayListA0C = AbstractC4159CoF.A0C(parcel, zzhg.CREATOR, i4);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA004);
                return new zzas(strA09, arrayListA0C);
            case 4:
                int iA005 = AbstractC4159CoF.A00(parcel);
                int iA01 = 0;
                zzbu zzbuVar = null;
                int iA012 = 0;
                int iA013 = 0;
                while (parcel.dataPosition() < iA005) {
                    int i5 = parcel.readInt();
                    char c5 = (char) i5;
                    if (c5 == 2) {
                        zzbuVar = (zzbu) AbstractC4159CoF.A08(parcel, zzbu.CREATOR, i5);
                    } else if (c5 == 3) {
                        iA01 = AbstractC4159CoF.A01(parcel, i5);
                    } else if (c5 == 4) {
                        iA012 = AbstractC4159CoF.A01(parcel, i5);
                    } else if (c5 != 5) {
                        AbstractC4159CoF.A0E(parcel, i5);
                    } else {
                        iA013 = AbstractC4159CoF.A01(parcel, i5);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA005);
                return new zzbj(zzbuVar, iA01, iA012, iA013);
            case 5:
                int iA006 = AbstractC4159CoF.A00(parcel);
                String strA092 = null;
                String strA093 = null;
                String strA0A2 = null;
                while (parcel.dataPosition() < iA006) {
                    int i6 = parcel.readInt();
                    char c6 = (char) i6;
                    if (c6 == 2) {
                        strA092 = AbstractC4159CoF.A09(parcel, i6);
                    } else if (c6 != 3) {
                        strA0A2 = AbstractC4159CoF.A0A(parcel, strA0A2, c6, 4, i6);
                    } else {
                        strA093 = AbstractC4159CoF.A09(parcel, i6);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA006);
                return new zzbu(strA092, strA093, strA0A2);
            case 6:
                int iA007 = AbstractC4159CoF.A00(parcel);
                boolean zA0H = false;
                String strA094 = null;
                while (parcel.dataPosition() < iA007) {
                    int i7 = parcel.readInt();
                    char c7 = (char) i7;
                    if (c7 != 1) {
                        zA0H = AbstractC4159CoF.A0H(parcel, c7, 2, i7, zA0H);
                    } else {
                        strA094 = AbstractC4159CoF.A09(parcel, i7);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA007);
                return new zzb(strA094, zA0H);
            case 7:
                int iA008 = AbstractC4159CoF.A00(parcel);
                int iA04 = 0;
                while (parcel.dataPosition() < iA008) {
                    int i8 = parcel.readInt();
                    iA04 = AbstractC4159CoF.A04(parcel, (char) i8, 2, i8, iA04);
                }
                AbstractC4159CoF.A0D(parcel, iA008);
                return new zzca(iA04);
            case 8:
                int iA009 = AbstractC4159CoF.A00(parcel);
                int iA042 = 0;
                while (parcel.dataPosition() < iA009) {
                    int i9 = parcel.readInt();
                    iA042 = AbstractC4159CoF.A04(parcel, (char) i9, 2, i9, iA042);
                }
                AbstractC4159CoF.A0D(parcel, iA009);
                return new zzcc(iA042);
            case 9:
                int iA0010 = AbstractC4159CoF.A00(parcel);
                int iA043 = 0;
                while (parcel.dataPosition() < iA0010) {
                    int i10 = parcel.readInt();
                    iA043 = AbstractC4159CoF.A04(parcel, (char) i10, 2, i10, iA043);
                }
                AbstractC4159CoF.A0D(parcel, iA0010);
                return new zzcg(iA043);
            case 10:
                int iA0011 = AbstractC4159CoF.A00(parcel);
                String strA0A3 = null;
                int iA023 = 0;
                while (parcel.dataPosition() < iA0011) {
                    int i11 = parcel.readInt();
                    char c8 = (char) i11;
                    if (c8 != 1) {
                        strA0A3 = AbstractC4159CoF.A0A(parcel, strA0A3, c8, 2, i11);
                    } else {
                        iA023 = AbstractC4159CoF.A02(parcel, i11);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0011);
                return new zzcj(iA023, strA0A3);
            case 11:
                int iA0012 = AbstractC4159CoF.A00(parcel);
                ArrayList arrayListA0C2 = null;
                int iA024 = 0;
                boolean zA1L = false;
                boolean zA1L2 = false;
                boolean zA1L3 = false;
                boolean zA1L4 = false;
                while (parcel.dataPosition() < iA0012) {
                    int i12 = parcel.readInt();
                    switch ((char) i12) {
                        case 1:
                            iA024 = AbstractC4159CoF.A02(parcel, i12);
                            break;
                        case 2:
                            zA1L = AnonymousClass002.A1L(AbstractC4159CoF.A02(parcel, i12));
                            break;
                        case 3:
                            zA1L2 = AnonymousClass002.A1L(AbstractC4159CoF.A02(parcel, i12));
                            break;
                        case 4:
                            zA1L3 = AnonymousClass002.A1L(AbstractC4159CoF.A02(parcel, i12));
                            break;
                        case 5:
                            zA1L4 = AnonymousClass002.A1L(AbstractC4159CoF.A02(parcel, i12));
                            break;
                        case 6:
                            arrayListA0C2 = AbstractC4159CoF.A0C(parcel, zzb.CREATOR, i12);
                            break;
                        default:
                            AbstractC4159CoF.A0E(parcel, i12);
                            break;
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0012);
                return new zzcl(arrayListA0C2, iA024, zA1L, zA1L2, zA1L3, zA1L4);
            case 12:
                int iA0013 = AbstractC4159CoF.A00(parcel);
                String strA095 = null;
                String strA0A4 = null;
                while (parcel.dataPosition() < iA0013) {
                    int i13 = parcel.readInt();
                    char c9 = (char) i13;
                    if (c9 != 2) {
                        strA0A4 = AbstractC4159CoF.A0A(parcel, strA0A4, c9, 3, i13);
                    } else {
                        strA095 = AbstractC4159CoF.A09(parcel, i13);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0013);
                return new DataItemAssetParcelable(strA095, strA0A4);
            case 13:
                int iA0014 = AbstractC4159CoF.A00(parcel);
                Uri uri = null;
                Bundle bundleA06 = null;
                byte[] bArrA0I = null;
                while (parcel.dataPosition() < iA0014) {
                    int i14 = parcel.readInt();
                    char c10 = (char) i14;
                    if (c10 == 2) {
                        uri = (Uri) AbstractC4159CoF.A08(parcel, Uri.CREATOR, i14);
                    } else if (c10 == 4) {
                        bundleA06 = AbstractC4159CoF.A06(parcel, i14);
                    } else if (c10 != 5) {
                        AbstractC4159CoF.A0E(parcel, i14);
                    } else {
                        bArrA0I = AbstractC4159CoF.A0I(parcel, i14);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0014);
                return new zzdo(uri, bundleA06, bArrA0I);
            case 14:
                int iA0015 = AbstractC4159CoF.A00(parcel);
                int iA025 = 0;
                int iA044 = 0;
                while (parcel.dataPosition() < iA0015) {
                    int i15 = parcel.readInt();
                    char c11 = (char) i15;
                    if (c11 != 2) {
                        iA044 = AbstractC4159CoF.A04(parcel, c11, 3, i15, iA044);
                    } else {
                        iA025 = AbstractC4159CoF.A02(parcel, i15);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0015);
                return new zzdr(iA025, iA044);
            case 15:
                int iA0016 = AbstractC4159CoF.A00(parcel);
                byte[] bArrA0I2 = null;
                while (parcel.dataPosition() < iA0016) {
                    int i16 = parcel.readInt();
                    if (((char) i16) != 1) {
                        AbstractC4159CoF.A0E(parcel, i16);
                    } else {
                        bArrA0I2 = AbstractC4159CoF.A0I(parcel, i16);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0016);
                return new zzdt(bArrA0I2);
            case 16:
                int iA0017 = AbstractC4159CoF.A00(parcel);
                ArrayList arrayListA0C3 = null;
                int iA026 = 0;
                while (parcel.dataPosition() < iA0017) {
                    int i17 = parcel.readInt();
                    char c12 = (char) i17;
                    if (c12 == 2) {
                        iA026 = AbstractC4159CoF.A02(parcel, i17);
                    } else if (c12 != 3) {
                        AbstractC4159CoF.A0E(parcel, i17);
                    } else {
                        arrayListA0C3 = AbstractC4159CoF.A0C(parcel, zzas.CREATOR, i17);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0017);
                return new zzdv(iA026, arrayListA0C3);
            case 17:
                int iA0018 = AbstractC4159CoF.A00(parcel);
                AppTheme appTheme = null;
                int iA027 = 0;
                while (parcel.dataPosition() < iA0018) {
                    int i18 = parcel.readInt();
                    char c13 = (char) i18;
                    if (c13 == 2) {
                        iA027 = AbstractC4159CoF.A02(parcel, i18);
                    } else if (c13 != 3) {
                        AbstractC4159CoF.A0E(parcel, i18);
                    } else {
                        appTheme = (AppTheme) AbstractC4159CoF.A08(parcel, AppTheme.CREATOR, i18);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0018);
                return new zzdx(appTheme, iA027);
            case 18:
                int iA0019 = AbstractC4159CoF.A00(parcel);
                int iA028 = 0;
                boolean zA0H2 = false;
                while (parcel.dataPosition() < iA0019) {
                    int i19 = parcel.readInt();
                    char c14 = (char) i19;
                    if (c14 != 1) {
                        zA0H2 = AbstractC4159CoF.A0H(parcel, c14, 2, i19, zA0H2);
                    } else {
                        iA028 = AbstractC4159CoF.A02(parcel, i19);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0019);
                return new zzdz(iA028, zA0H2);
            case 19:
                int iA0020 = AbstractC4159CoF.A00(parcel);
                zzas zzasVar = null;
                int iA029 = 0;
                while (parcel.dataPosition() < iA0020) {
                    int i20 = parcel.readInt();
                    char c15 = (char) i20;
                    if (c15 == 2) {
                        iA029 = AbstractC4159CoF.A02(parcel, i20);
                    } else if (c15 != 3) {
                        AbstractC4159CoF.A0E(parcel, i20);
                    } else {
                        zzasVar = (zzas) AbstractC4159CoF.A08(parcel, zzas.CREATOR, i20);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0020);
                return new zzeb(zzasVar, iA029);
            case 20:
                int iA0021 = AbstractC4159CoF.A00(parcel);
                ParcelFileDescriptor parcelFileDescriptor = null;
                int iA0210 = 0;
                while (parcel.dataPosition() < iA0021) {
                    int i21 = parcel.readInt();
                    char c16 = (char) i21;
                    if (c16 == 2) {
                        iA0210 = AbstractC4159CoF.A02(parcel, i21);
                    } else if (c16 != 3) {
                        AbstractC4159CoF.A0E(parcel, i21);
                    } else {
                        parcelFileDescriptor = (ParcelFileDescriptor) AbstractC4159CoF.A08(parcel, ParcelFileDescriptor.CREATOR, i21);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0021);
                return new zzed(parcelFileDescriptor, iA0210);
            case 21:
                int iA0022 = AbstractC4159CoF.A00(parcel);
                ParcelFileDescriptor parcelFileDescriptor2 = null;
                int iA0211 = 0;
                while (parcel.dataPosition() < iA0022) {
                    int i22 = parcel.readInt();
                    char c17 = (char) i22;
                    if (c17 == 2) {
                        iA0211 = AbstractC4159CoF.A02(parcel, i22);
                    } else if (c17 != 3) {
                        AbstractC4159CoF.A0E(parcel, i22);
                    } else {
                        parcelFileDescriptor2 = (ParcelFileDescriptor) AbstractC4159CoF.A08(parcel, ParcelFileDescriptor.CREATOR, i22);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0022);
                return new zzef(parcelFileDescriptor2, iA0211);
            case 22:
                int iA0023 = AbstractC4159CoF.A00(parcel);
                int iA0212 = 0;
                boolean zA0H3 = false;
                while (parcel.dataPosition() < iA0023) {
                    int i23 = parcel.readInt();
                    char c18 = (char) i23;
                    if (c18 != 2) {
                        zA0H3 = AbstractC4159CoF.A0H(parcel, c18, 3, i23, zA0H3);
                    } else {
                        iA0212 = AbstractC4159CoF.A02(parcel, i23);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0023);
                return new zzei(iA0212, zA0H3);
            case 23:
                int iA0024 = AbstractC4159CoF.A00(parcel);
                int iA0213 = 0;
                boolean zA1L5 = false;
                boolean zA0H4 = false;
                while (parcel.dataPosition() < iA0024) {
                    int i24 = parcel.readInt();
                    char c19 = (char) i24;
                    if (c19 == 2) {
                        iA0213 = AbstractC4159CoF.A02(parcel, i24);
                    } else if (c19 != 3) {
                        zA0H4 = AbstractC4159CoF.A0H(parcel, c19, 4, i24, zA0H4);
                    } else {
                        zA1L5 = AnonymousClass002.A1L(AbstractC4159CoF.A02(parcel, i24));
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0024);
                return new zzek(iA0213, zA1L5, zA0H4);
            case 24:
                int iA0025 = AbstractC4159CoF.A00(parcel);
                int iA0214 = 0;
                boolean zA0H5 = false;
                while (parcel.dataPosition() < iA0025) {
                    int i25 = parcel.readInt();
                    char c20 = (char) i25;
                    if (c20 != 2) {
                        zA0H5 = AbstractC4159CoF.A0H(parcel, c20, 3, i25, zA0H5);
                    } else {
                        iA0214 = AbstractC4159CoF.A02(parcel, i25);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0025);
                return new zzem(iA0214, zA0H5);
            case 25:
                int iA0026 = AbstractC4159CoF.A00(parcel);
                String strA0A5 = null;
                int iA0215 = 0;
                while (parcel.dataPosition() < iA0026) {
                    int i26 = parcel.readInt();
                    char c21 = (char) i26;
                    if (c21 != 2) {
                        strA0A5 = AbstractC4159CoF.A0A(parcel, strA0A5, c21, 3, i26);
                    } else {
                        iA0215 = AbstractC4159CoF.A02(parcel, i26);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0026);
                return new zzen(iA0215, strA0A5);
            case 26:
                int iA0027 = AbstractC4159CoF.A00(parcel);
                ConnectionConfiguration connectionConfiguration = null;
                int iA0216 = 0;
                while (parcel.dataPosition() < iA0027) {
                    int i27 = parcel.readInt();
                    char c22 = (char) i27;
                    if (c22 == 2) {
                        iA0216 = AbstractC4159CoF.A02(parcel, i27);
                    } else if (c22 != 3) {
                        AbstractC4159CoF.A0E(parcel, i27);
                    } else {
                        connectionConfiguration = (ConnectionConfiguration) AbstractC4159CoF.A08(parcel, ConnectionConfiguration.CREATOR, i27);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0027);
                return new zzep(connectionConfiguration, iA0216);
            case 27:
                int iA0028 = AbstractC4159CoF.A00(parcel);
                ConnectionConfiguration[] connectionConfigurationArr = null;
                int iA0217 = 0;
                while (parcel.dataPosition() < iA0028) {
                    int i28 = parcel.readInt();
                    char c23 = (char) i28;
                    if (c23 == 2) {
                        iA0217 = AbstractC4159CoF.A02(parcel, i28);
                    } else if (c23 != 3) {
                        AbstractC4159CoF.A0E(parcel, i28);
                    } else {
                        connectionConfigurationArr = (ConnectionConfiguration[]) AbstractC4159CoF.A0J(parcel, ConnectionConfiguration.CREATOR, i28);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0028);
                return new zzer(connectionConfigurationArr, iA0217);
            case 28:
                int iA0029 = AbstractC4159CoF.A00(parcel);
                ArrayList arrayListA0C4 = null;
                int iA0218 = 0;
                while (parcel.dataPosition() < iA0029) {
                    int i29 = parcel.readInt();
                    char c24 = (char) i29;
                    if (c24 == 2) {
                        iA0218 = AbstractC4159CoF.A02(parcel, i29);
                    } else if (c24 != 3) {
                        AbstractC4159CoF.A0E(parcel, i29);
                    } else {
                        arrayListA0C4 = AbstractC4159CoF.A0C(parcel, zzhg.CREATOR, i29);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0029);
                return new zzet(iA0218, arrayListA0C4);
            case 29:
                int iA0030 = AbstractC4159CoF.A00(parcel);
                zzdo zzdoVar = null;
                int iA0219 = 0;
                while (parcel.dataPosition() < iA0030) {
                    int i30 = parcel.readInt();
                    char c25 = (char) i30;
                    if (c25 == 2) {
                        iA0219 = AbstractC4159CoF.A02(parcel, i30);
                    } else if (c25 != 3) {
                        AbstractC4159CoF.A0E(parcel, i30);
                    } else {
                        zzdoVar = (zzdo) AbstractC4159CoF.A08(parcel, zzdo.CREATOR, i30);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0030);
                return new zzev(zzdoVar, iA0219);
            case 30:
                int iA0031 = AbstractC4159CoF.A00(parcel);
                String strA0A6 = null;
                int iA0220 = 0;
                while (parcel.dataPosition() < iA0031) {
                    int i31 = parcel.readInt();
                    char c26 = (char) i31;
                    if (c26 != 2) {
                        strA0A6 = AbstractC4159CoF.A0A(parcel, strA0A6, c26, 3, i31);
                    } else {
                        iA0220 = AbstractC4159CoF.A02(parcel, i31);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0031);
                return new zzex(iA0220, strA0A6);
            case 31:
                int iA0032 = AbstractC4159CoF.A00(parcel);
                ArrayList arrayListA0C5 = null;
                int iA0221 = 0;
                while (parcel.dataPosition() < iA0032) {
                    int i32 = parcel.readInt();
                    char c27 = (char) i32;
                    if (c27 == 1) {
                        iA0221 = AbstractC4159CoF.A02(parcel, i32);
                    } else if (c27 != 2) {
                        AbstractC4159CoF.A0E(parcel, i32);
                    } else {
                        arrayListA0C5 = AbstractC4159CoF.A0C(parcel, zzdt.CREATOR, i32);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0032);
                return new zzez(iA0221, arrayListA0C5);
            case 32:
                int iA0033 = AbstractC4159CoF.A00(parcel);
                ParcelFileDescriptor parcelFileDescriptor3 = null;
                int iA0222 = 0;
                while (parcel.dataPosition() < iA0033) {
                    int i33 = parcel.readInt();
                    char c28 = (char) i33;
                    if (c28 == 2) {
                        iA0222 = AbstractC4159CoF.A02(parcel, i33);
                    } else if (c28 != 3) {
                        AbstractC4159CoF.A0E(parcel, i33);
                    } else {
                        parcelFileDescriptor3 = (ParcelFileDescriptor) AbstractC4159CoF.A08(parcel, ParcelFileDescriptor.CREATOR, i33);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0033);
                return new zzfb(parcelFileDescriptor3, iA0222);
            case 33:
                int iA0034 = AbstractC4159CoF.A00(parcel);
                zzhg zzhgVar = null;
                int iA0223 = 0;
                while (parcel.dataPosition() < iA0034) {
                    int i34 = parcel.readInt();
                    char c29 = (char) i34;
                    if (c29 == 2) {
                        iA0223 = AbstractC4159CoF.A02(parcel, i34);
                    } else if (c29 != 3) {
                        AbstractC4159CoF.A0E(parcel, i34);
                    } else {
                        zzhgVar = (zzhg) AbstractC4159CoF.A08(parcel, zzhg.CREATOR, i34);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0034);
                return new zzfd(zzhgVar, iA0223);
            case 34:
                int iA0035 = AbstractC4159CoF.A00(parcel);
                String strA0A7 = null;
                int iA0224 = 0;
                while (parcel.dataPosition() < iA0035) {
                    int i35 = parcel.readInt();
                    char c30 = (char) i35;
                    if (c30 != 2) {
                        strA0A7 = AbstractC4159CoF.A0A(parcel, strA0A7, c30, 3, i35);
                    } else {
                        iA0224 = AbstractC4159CoF.A02(parcel, i35);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0035);
                return new zzff(iA0224, strA0A7);
            case 35:
                int iA0036 = AbstractC4159CoF.A00(parcel);
                byte[] bArrA0I3 = null;
                int iA0225 = 0;
                int iA0226 = 0;
                while (parcel.dataPosition() < iA0036) {
                    int i36 = parcel.readInt();
                    char c31 = (char) i36;
                    if (c31 == 1) {
                        iA0225 = AbstractC4159CoF.A02(parcel, i36);
                    } else if (c31 == 2) {
                        iA0226 = AbstractC4159CoF.A02(parcel, i36);
                    } else if (c31 != 3) {
                        AbstractC4159CoF.A0E(parcel, i36);
                    } else {
                        bArrA0I3 = AbstractC4159CoF.A0I(parcel, i36);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0036);
                return new zzfh(bArrA0I3, iA0225, iA0226);
            case 36:
                int iA0037 = AbstractC4159CoF.A00(parcel);
                int iA0227 = 0;
                boolean zA0H6 = false;
                while (parcel.dataPosition() < iA0037) {
                    int i37 = parcel.readInt();
                    char c32 = (char) i37;
                    if (c32 != 1) {
                        zA0H6 = AbstractC4159CoF.A0H(parcel, c32, 2, i37, zA0H6);
                    } else {
                        iA0227 = AbstractC4159CoF.A02(parcel, i37);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0037);
                return new zzfj(iA0227, zA0H6);
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginLeft /* 37 */:
                int iA0038 = AbstractC4159CoF.A00(parcel);
                int iA0228 = 0;
                String strA096 = null;
                int iA045 = 0;
                while (parcel.dataPosition() < iA0038) {
                    int i38 = parcel.readInt();
                    char c33 = (char) i38;
                    if (c33 == 1) {
                        strA096 = AbstractC4159CoF.A09(parcel, i38);
                    } else if (c33 != 2) {
                        iA045 = AbstractC4159CoF.A04(parcel, c33, 3, i38, iA045);
                    } else {
                        iA0228 = AbstractC4159CoF.A02(parcel, i38);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0038);
                return new zzjs(strA096, iA0228, iA045);
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginRight /* 38 */:
                int iA0039 = AbstractC4159CoF.A00(parcel);
                IBinder iBinderA07 = null;
                IntentFilter[] intentFilterArr = null;
                String strA097 = null;
                String strA0A8 = null;
                while (parcel.dataPosition() < iA0039) {
                    int i39 = parcel.readInt();
                    char c34 = (char) i39;
                    if (c34 == 2) {
                        iBinderA07 = AbstractC4159CoF.A07(parcel, i39);
                    } else if (c34 == 3) {
                        intentFilterArr = (IntentFilter[]) AbstractC4159CoF.A0J(parcel, IntentFilter.CREATOR, i39);
                    } else if (c34 != 4) {
                        strA0A8 = AbstractC4159CoF.A0A(parcel, strA0A8, c34, 5, i39);
                    } else {
                        strA097 = AbstractC4159CoF.A09(parcel, i39);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0039);
                return new zzf(iBinderA07, strA097, strA0A8, intentFilterArr);
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginTop /* 39 */:
                int iA0040 = AbstractC4159CoF.A00(parcel);
                String strA098 = null;
                byte[] bArrA0I4 = null;
                String strA0A9 = null;
                int iA0229 = 0;
                while (parcel.dataPosition() < iA0040) {
                    int i40 = parcel.readInt();
                    char c35 = (char) i40;
                    if (c35 == 2) {
                        iA0229 = AbstractC4159CoF.A02(parcel, i40);
                    } else if (c35 == 3) {
                        strA098 = AbstractC4159CoF.A09(parcel, i40);
                    } else if (c35 != 4) {
                        strA0A9 = AbstractC4159CoF.A0A(parcel, strA0A9, c35, 5, i40);
                    } else {
                        bArrA0I4 = AbstractC4159CoF.A0I(parcel, i40);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0040);
                return new zzgp(strA098, strA0A9, bArrA0I4, iA0229);
            case 40:
                int iA0041 = AbstractC4159CoF.A00(parcel);
                String strA099 = null;
                DataHolder dataHolder = null;
                while (parcel.dataPosition() < iA0041) {
                    int i41 = parcel.readInt();
                    char c36 = (char) i41;
                    if (c36 == 1) {
                        strA099 = AbstractC4159CoF.A09(parcel, i41);
                    } else if (c36 != 2) {
                        AbstractC4159CoF.A0E(parcel, i41);
                    } else {
                        dataHolder = (DataHolder) AbstractC4159CoF.A08(parcel, DataHolder.CREATOR, i41);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0041);
                return new zzhf(dataHolder, strA099);
            case R.styleable.maplibre_MapView_maplibre_uiHorizontalScrollGestures /* 41 */:
                int iA0042 = AbstractC4159CoF.A00(parcel);
                int iA014 = 0;
                String strA0910 = null;
                String strA0911 = null;
                boolean zA0H7 = false;
                while (parcel.dataPosition() < iA0042) {
                    int i42 = parcel.readInt();
                    char c37 = (char) i42;
                    if (c37 == 2) {
                        strA0910 = AbstractC4159CoF.A09(parcel, i42);
                    } else if (c37 == 3) {
                        strA0911 = AbstractC4159CoF.A09(parcel, i42);
                    } else if (c37 != 4) {
                        zA0H7 = AbstractC4159CoF.A0H(parcel, c37, 5, i42, zA0H7);
                    } else {
                        iA014 = AbstractC4159CoF.A01(parcel, i42);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0042);
                return new zzhg(strA0910, strA0911, iA014, zA0H7);
            case 42:
                int iA0043 = AbstractC4159CoF.A00(parcel);
                zzbu zzbuVar2 = null;
                int iA0230 = 0;
                while (parcel.dataPosition() < iA0043) {
                    int i43 = parcel.readInt();
                    char c38 = (char) i43;
                    if (c38 == 2) {
                        iA0230 = AbstractC4159CoF.A02(parcel, i43);
                    } else if (c38 != 3) {
                        AbstractC4159CoF.A0E(parcel, i43);
                    } else {
                        zzbuVar2 = (zzbu) AbstractC4159CoF.A08(parcel, zzbu.CREATOR, i43);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0043);
                return new zzhi(zzbuVar2, iA0230);
            case R.styleable.maplibre_MapView_maplibre_uiLogoGravity /* 43 */:
                int iA0044 = AbstractC4159CoF.A00(parcel);
                long jA05 = 0;
                String strA0912 = null;
                String strA0913 = null;
                while (parcel.dataPosition() < iA0044) {
                    int i44 = parcel.readInt();
                    char c39 = (char) i44;
                    if (c39 == 2) {
                        strA0912 = AbstractC4159CoF.A09(parcel, i44);
                    } else if (c39 == 3) {
                        strA0913 = AbstractC4159CoF.A09(parcel, i44);
                    } else if (c39 != 4) {
                        AbstractC4159CoF.A0E(parcel, i44);
                    } else {
                        jA05 = AbstractC4159CoF.A05(parcel, i44);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0044);
                return new zzhk(strA0912, strA0913, jA05);
            case 44:
                int iA0045 = AbstractC4159CoF.A00(parcel);
                String strA0A10 = null;
                int iA0231 = 0;
                while (parcel.dataPosition() < iA0045) {
                    int i45 = parcel.readInt();
                    char c40 = (char) i45;
                    if (c40 != 2) {
                        strA0A10 = AbstractC4159CoF.A0A(parcel, strA0A10, c40, 3, i45);
                    } else {
                        iA0231 = AbstractC4159CoF.A02(parcel, i45);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0045);
                return new zzhm(iA0231, strA0A10);
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginLeft /* 45 */:
                int iA0046 = AbstractC4159CoF.A00(parcel);
                zzdo zzdoVar2 = null;
                int iA0232 = 0;
                while (parcel.dataPosition() < iA0046) {
                    int i46 = parcel.readInt();
                    char c41 = (char) i46;
                    if (c41 == 2) {
                        iA0232 = AbstractC4159CoF.A02(parcel, i46);
                    } else if (c41 != 3) {
                        AbstractC4159CoF.A0E(parcel, i46);
                    } else {
                        zzdoVar2 = (zzdo) AbstractC4159CoF.A08(parcel, zzdo.CREATOR, i46);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0046);
                return new zzho(zzdoVar2, iA0232);
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginRight /* 46 */:
                int iA0047 = AbstractC4159CoF.A00(parcel);
                int iA046 = 0;
                while (parcel.dataPosition() < iA0047) {
                    int i47 = parcel.readInt();
                    iA046 = AbstractC4159CoF.A04(parcel, (char) i47, 2, i47, iA046);
                }
                AbstractC4159CoF.A0D(parcel, iA0047);
                return new zzhs(iA046);
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginTop /* 47 */:
                int iA0048 = AbstractC4159CoF.A00(parcel);
                String strA0A11 = null;
                while (parcel.dataPosition() < iA0048) {
                    int i48 = parcel.readInt();
                    strA0A11 = AbstractC4159CoF.A0A(parcel, strA0A11, (char) i48, 1, i48);
                }
                AbstractC4159CoF.A0D(parcel, iA0048);
                return new zzhu(strA0A11);
            case 48:
                int iA0049 = AbstractC4159CoF.A00(parcel);
                byte[] bArrA0I5 = null;
                int iA0233 = 0;
                int iA0234 = 0;
                while (parcel.dataPosition() < iA0049) {
                    int i49 = parcel.readInt();
                    char c42 = (char) i49;
                    if (c42 == 1) {
                        iA0233 = AbstractC4159CoF.A02(parcel, i49);
                    } else if (c42 == 2) {
                        iA0234 = AbstractC4159CoF.A02(parcel, i49);
                    } else if (c42 != 3) {
                        AbstractC4159CoF.A0E(parcel, i49);
                    } else {
                        bArrA0I5 = AbstractC4159CoF.A0I(parcel, i49);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0049);
                return new zzhw(bArrA0I5, iA0233, iA0234);
            case R.styleable.maplibre_MapView_maplibre_uiRotateGestures /* 49 */:
                int iA0050 = AbstractC4159CoF.A00(parcel);
                int iA0235 = 0;
                int iA047 = 0;
                while (parcel.dataPosition() < iA0050) {
                    int i50 = parcel.readInt();
                    char c43 = (char) i50;
                    if (c43 != 2) {
                        iA047 = AbstractC4159CoF.A04(parcel, c43, 3, i50, iA047);
                    } else {
                        iA0235 = AbstractC4159CoF.A02(parcel, i50);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0050);
                return new zzhy(iA0235, iA047);
            case 50:
                int iA0051 = AbstractC4159CoF.A00(parcel);
                int iA048 = 0;
                while (parcel.dataPosition() < iA0051) {
                    int i51 = parcel.readInt();
                    iA048 = AbstractC4159CoF.A04(parcel, (char) i51, 2, i51, iA048);
                }
                AbstractC4159CoF.A0D(parcel, iA0051);
                return new zzh(iA048);
            case R.styleable.maplibre_MapView_maplibre_uiTiltGestures /* 51 */:
                int iA0052 = AbstractC4159CoF.A00(parcel);
                ArrayList arrayListA0C6 = null;
                long jA052 = 0;
                int iA0236 = 0;
                while (parcel.dataPosition() < iA0052) {
                    int i52 = parcel.readInt();
                    char c44 = (char) i52;
                    if (c44 == 2) {
                        iA0236 = AbstractC4159CoF.A02(parcel, i52);
                    } else if (c44 == 3) {
                        jA052 = AbstractC4159CoF.A05(parcel, i52);
                    } else if (c44 != 4) {
                        AbstractC4159CoF.A0E(parcel, i52);
                    } else {
                        arrayListA0C6 = AbstractC4159CoF.A0C(parcel, zzhk.CREATOR, i52);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0052);
                return new zzic(iA0236, jA052, arrayListA0C6);
            case 52:
                int iA0053 = AbstractC4159CoF.A00(parcel);
                String strA0A12 = null;
                byte bA02 = 0;
                byte bA022 = 0;
                while (parcel.dataPosition() < iA0053) {
                    int i53 = parcel.readInt();
                    char c45 = (char) i53;
                    if (c45 == 2) {
                        bA02 = (byte) AbstractC4159CoF.A02(parcel, i53);
                    } else if (c45 != 3) {
                        strA0A12 = AbstractC4159CoF.A0A(parcel, strA0A12, c45, 4, i53);
                    } else {
                        bA022 = (byte) AbstractC4159CoF.A02(parcel, i53);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0053);
                return new zzk(strA0A12, bA02, bA022);
            case 53:
                int iA0054 = AbstractC4159CoF.A00(parcel);
                String strA0914 = null;
                String strA0915 = null;
                String strA0916 = null;
                String strA0917 = null;
                String strA0918 = null;
                String strA0919 = null;
                String strA0920 = null;
                int iA0237 = 0;
                byte bA023 = 0;
                byte bA024 = 0;
                byte bA025 = 0;
                byte bA026 = 0;
                while (parcel.dataPosition() < iA0054) {
                    int i54 = parcel.readInt();
                    switch ((char) i54) {
                        case 2:
                            iA0237 = AbstractC4159CoF.A02(parcel, i54);
                            break;
                        case 3:
                            strA0914 = AbstractC4159CoF.A09(parcel, i54);
                            break;
                        case 4:
                            strA0915 = AbstractC4159CoF.A09(parcel, i54);
                            break;
                        case 5:
                            strA0916 = AbstractC4159CoF.A09(parcel, i54);
                            break;
                        case 6:
                            strA0917 = AbstractC4159CoF.A09(parcel, i54);
                            break;
                        case 7:
                            strA0918 = AbstractC4159CoF.A09(parcel, i54);
                            break;
                        case '\b':
                            strA0919 = AbstractC4159CoF.A09(parcel, i54);
                            break;
                        case '\t':
                            bA023 = (byte) AbstractC4159CoF.A02(parcel, i54);
                            break;
                        case '\n':
                            bA024 = (byte) AbstractC4159CoF.A02(parcel, i54);
                            break;
                        case 11:
                            bA025 = (byte) AbstractC4159CoF.A02(parcel, i54);
                            break;
                        case '\f':
                            bA026 = (byte) AbstractC4159CoF.A02(parcel, i54);
                            break;
                        case '\r':
                            strA0920 = AbstractC4159CoF.A09(parcel, i54);
                            break;
                        default:
                            AbstractC4159CoF.A0E(parcel, i54);
                            break;
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0054);
                return new zzn(strA0914, strA0915, strA0916, strA0917, strA0918, strA0919, strA0920, bA023, bA024, bA025, bA026, iA0237);
            case 54:
                int iA0055 = AbstractC4159CoF.A00(parcel);
                String strA0921 = null;
                String strA0922 = null;
                zzjs zzjsVar = null;
                String strA0923 = null;
                String strA0924 = null;
                Float fValueOf = null;
                zzu zzuVar = null;
                while (parcel.dataPosition() < iA0055) {
                    int i55 = parcel.readInt();
                    switch ((char) i55) {
                        case 1:
                            strA0921 = AbstractC4159CoF.A09(parcel, i55);
                            break;
                        case 2:
                            strA0922 = AbstractC4159CoF.A09(parcel, i55);
                            break;
                        case 3:
                            zzjsVar = (zzjs) AbstractC4159CoF.A08(parcel, zzjs.CREATOR, i55);
                            break;
                        case 4:
                            strA0923 = AbstractC4159CoF.A09(parcel, i55);
                            break;
                        case 5:
                            strA0924 = AbstractC4159CoF.A09(parcel, i55);
                            break;
                        case 6:
                            int iA03 = AbstractC4159CoF.A03(parcel, i55);
                            if (iA03 == 0) {
                                fValueOf = null;
                                break;
                            } else {
                                if (iA03 != 4) {
                                    String hexString = Integer.toHexString(iA03);
                                    StringBuilder sbA0y = C60O.A0y("Expected size ", 4);
                                    sbA0y.append(" got ");
                                    sbA0y.append(iA03);
                                    throw new SafeParcelReader$ParseException(parcel, C3cJ.A0N(" (0x", hexString, sbA0y));
                                }
                                fValueOf = Float.valueOf(parcel.readFloat());
                                break;
                            }
                        case 7:
                            zzuVar = (zzu) AbstractC4159CoF.A08(parcel, zzu.CREATOR, i55);
                            break;
                        default:
                            AbstractC4159CoF.A0E(parcel, i55);
                            break;
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0055);
                return new zzq(zzjsVar, zzuVar, fValueOf, strA0921, strA0922, strA0923, strA0924);
            case 55:
                int iA0056 = AbstractC4159CoF.A00(parcel);
                ArrayList arrayListA0C7 = null;
                zzjs zzjsVar2 = null;
                int iA0238 = 0;
                while (parcel.dataPosition() < iA0056) {
                    int i56 = parcel.readInt();
                    char c46 = (char) i56;
                    if (c46 == 1) {
                        iA0238 = AbstractC4159CoF.A02(parcel, i56);
                    } else if (c46 == 2) {
                        arrayListA0C7 = AbstractC4159CoF.A0C(parcel, zzq.CREATOR, i56);
                    } else if (c46 != 3) {
                        AbstractC4159CoF.A0E(parcel, i56);
                    } else {
                        zzjsVar2 = (zzjs) AbstractC4159CoF.A08(parcel, zzjs.CREATOR, i56);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0056);
                return new zzs(zzjsVar2, arrayListA0C7, iA0238);
            case 56:
                int iA0057 = AbstractC4159CoF.A00(parcel);
                ArrayList<String> arrayListA0B2 = null;
                boolean zA1L6 = false;
                while (parcel.dataPosition() < iA0057) {
                    int i57 = parcel.readInt();
                    char c47 = (char) i57;
                    if (c47 == 1) {
                        zA1L6 = AnonymousClass002.A1L(AbstractC4159CoF.A02(parcel, i57));
                    } else if (c47 != 2) {
                        AbstractC4159CoF.A0E(parcel, i57);
                    } else {
                        arrayListA0B2 = AbstractC4159CoF.A0B(parcel, i57);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0057);
                return new zzu(zA1L6, arrayListA0B2);
            case 57:
                int iA0058 = AbstractC4159CoF.A00(parcel);
                int iA0239 = 0;
                boolean zA0H8 = false;
                while (parcel.dataPosition() < iA0058) {
                    int i58 = parcel.readInt();
                    char c48 = (char) i58;
                    if (c48 != 1) {
                        zA0H8 = AbstractC4159CoF.A0H(parcel, c48, 2, i58, zA0H8);
                    } else {
                        iA0239 = AbstractC4159CoF.A02(parcel, i58);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0058);
                return new zzx(iA0239, zA0H8);
            case 58:
                int iA0059 = AbstractC4159CoF.A00(parcel);
                int iA0240 = 0;
                int iA0241 = 0;
                int iA015 = 0;
                int iA016 = 0;
                while (parcel.dataPosition() < iA0059) {
                    int i59 = parcel.readInt();
                    char c49 = (char) i59;
                    if (c49 == 1) {
                        iA0240 = AbstractC4159CoF.A02(parcel, i59);
                    } else if (c49 == 2) {
                        iA0241 = AbstractC4159CoF.A02(parcel, i59);
                    } else if (c49 == 3) {
                        iA015 = AbstractC4159CoF.A01(parcel, i59);
                    } else if (c49 != 4) {
                        AbstractC4159CoF.A0E(parcel, i59);
                    } else {
                        iA016 = AbstractC4159CoF.A01(parcel, i59);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0059);
                return new AppTheme(iA0240, iA0241, iA015, iA016);
            case 59:
                int iA0060 = AbstractC4159CoF.A00(parcel);
                String strA0925 = null;
                String strA0926 = null;
                String strA0927 = null;
                String strA0928 = null;
                String strA0929 = null;
                ArrayList<String> arrayListA0B3 = null;
                com.google.android.gms.wearable.zzf zzfVar = null;
                int iA0242 = 0;
                int iA0243 = 0;
                boolean zA1L7 = false;
                boolean zA1L8 = false;
                boolean zA1L9 = false;
                int iA0244 = 0;
                boolean zA1L10 = false;
                boolean zA1L11 = true;
                while (parcel.dataPosition() < iA0060) {
                    int i60 = parcel.readInt();
                    switch ((char) i60) {
                        case 2:
                            strA0925 = AbstractC4159CoF.A09(parcel, i60);
                            break;
                        case 3:
                            strA0926 = AbstractC4159CoF.A09(parcel, i60);
                            break;
                        case 4:
                            iA0242 = AbstractC4159CoF.A02(parcel, i60);
                            break;
                        case 5:
                            iA0243 = AbstractC4159CoF.A02(parcel, i60);
                            break;
                        case 6:
                            zA1L7 = AnonymousClass002.A1L(AbstractC4159CoF.A02(parcel, i60));
                            break;
                        case 7:
                            zA1L8 = AnonymousClass002.A1L(AbstractC4159CoF.A02(parcel, i60));
                            break;
                        case '\b':
                            strA0927 = AbstractC4159CoF.A09(parcel, i60);
                            break;
                        case '\t':
                            zA1L9 = AnonymousClass002.A1L(AbstractC4159CoF.A02(parcel, i60));
                            break;
                        case '\n':
                            strA0928 = AbstractC4159CoF.A09(parcel, i60);
                            break;
                        case 11:
                            strA0929 = AbstractC4159CoF.A09(parcel, i60);
                            break;
                        case '\f':
                            iA0244 = AbstractC4159CoF.A02(parcel, i60);
                            break;
                        case '\r':
                            arrayListA0B3 = AbstractC4159CoF.A0B(parcel, i60);
                            break;
                        case 14:
                            zA1L10 = AnonymousClass002.A1L(AbstractC4159CoF.A02(parcel, i60));
                            break;
                        case 15:
                            zA1L11 = AnonymousClass002.A1L(AbstractC4159CoF.A02(parcel, i60));
                            break;
                        case 16:
                            zzfVar = (com.google.android.gms.wearable.zzf) AbstractC4159CoF.A08(parcel, com.google.android.gms.wearable.zzf.CREATOR, i60);
                            break;
                        default:
                            AbstractC4159CoF.A0E(parcel, i60);
                            break;
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0060);
                return new ConnectionConfiguration(zzfVar, strA0925, strA0926, strA0927, strA0928, strA0929, arrayListA0B3, iA0242, iA0243, iA0244, zA1L7, zA1L8, zA1L9, zA1L10, zA1L11);
            case 60:
                int iA0061 = AbstractC4159CoF.A00(parcel);
                ArrayList arrayListA0C8 = null;
                ArrayList<String> arrayListA0B4 = null;
                ArrayList<String> arrayListA0B5 = null;
                while (parcel.dataPosition() < iA0061) {
                    int i61 = parcel.readInt();
                    char c50 = (char) i61;
                    if (c50 == 1) {
                        arrayListA0C8 = AbstractC4159CoF.A0C(parcel, com.google.android.gms.wearable.zzh.CREATOR, i61);
                    } else if (c50 == 2) {
                        arrayListA0B4 = AbstractC4159CoF.A0B(parcel, i61);
                    } else if (c50 != 3) {
                        AbstractC4159CoF.A0E(parcel, i61);
                    } else {
                        arrayListA0B5 = AbstractC4159CoF.A0B(parcel, i61);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0061);
                return new com.google.android.gms.wearable.zzf(arrayListA0C8, arrayListA0B4, arrayListA0B5);
            case 61:
                int iA0062 = AbstractC4159CoF.A00(parcel);
                int iA049 = 0;
                Uri uri2 = null;
                while (parcel.dataPosition() < iA0062) {
                    int i62 = parcel.readInt();
                    char c51 = (char) i62;
                    if (c51 != 1) {
                        iA049 = AbstractC4159CoF.A04(parcel, c51, 2, i62, iA049);
                    } else {
                        uri2 = (Uri) AbstractC4159CoF.A08(parcel, Uri.CREATOR, i62);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0062);
                return new com.google.android.gms.wearable.zzh(uri2, iA049);
            case HatchMessageShareDocumentRenderer.TABLE_MIN_ROW_HEIGHT_PX /* 62 */:
                return new zza((PendingIntent) parcel.readParcelable(ReviewInfo.class.getClassLoader()), AnonymousClass002.A1L(parcel.readInt()));
            case 63:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    return null;
                }
                zzm zzmVar = new zzm();
                zzmVar.A00 = new Messenger(strongBinder);
                return zzmVar;
            case 64:
                int iA0063 = AbstractC4159CoF.A00(parcel);
                Bundle bundleA062 = null;
                while (parcel.dataPosition() < iA0063) {
                    int i63 = parcel.readInt();
                    if (((char) i63) != 2) {
                        AbstractC4159CoF.A0E(parcel, i63);
                    } else {
                        bundleA062 = AbstractC4159CoF.A06(parcel, i63);
                    }
                }
                AbstractC4159CoF.A0D(parcel, iA0063);
                RemoteMessage remoteMessage = new RemoteMessage();
                remoteMessage.A00 = bundleA062;
                return remoteMessage;
            case LinkEncryptedPairingKt.LINK_PUBLIC_KEY_SIZE /* 65 */:
                C7384Etj.A0Y(parcel, 0);
                parcel.readInt();
                return CdsBottomSheetDimmingBehaviour.Default.A00;
            case 66:
                C7384Etj.A0Y(parcel, 0);
                return new CdsBottomSheetDimmingBehaviour.FixedAlpha(parcel.readFloat());
            case MessageDraftSenderKt.UNICODE_MULTIPART_CHARS /* 67 */:
                return new CdsBottomSheetTopSpan.Dp(C7384Etj.A03(parcel));
            case 68:
                C7384Etj.A0Y(parcel, 0);
                return new CdsBottomSheetTopSpan.ScreenPercent(parcel.readFloat());
            case 69:
                return new CdsOpenScreenConfig$BottomSheetMargins(C7384Etj.A03(parcel), parcel.readInt(), parcel.readInt(), parcel.readInt());
            default:
                return null;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.$t) {
            case 0:
                return new zag[i];
            case 1:
                return new zai[i];
            case 2:
                return new zak[i];
            case 3:
                return new zzas[i];
            case 4:
                return new zzbj[i];
            case 5:
                return new zzbu[i];
            case 6:
                return new zzb[i];
            case 7:
                return new zzca[i];
            case 8:
                return new zzcc[i];
            case 9:
                return new zzcg[i];
            case 10:
                return new zzcj[i];
            case 11:
                return new zzcl[i];
            case 12:
                return new DataItemAssetParcelable[i];
            case 13:
                return new zzdo[i];
            case 14:
                return new zzdr[i];
            case 15:
                return new zzdt[i];
            case 16:
                return new zzdv[i];
            case 17:
                return new zzdx[i];
            case 18:
                return new zzdz[i];
            case 19:
                return new zzeb[i];
            case 20:
                return new zzed[i];
            case 21:
                return new zzef[i];
            case 22:
                return new zzei[i];
            case 23:
                return new zzek[i];
            case 24:
                return new zzem[i];
            case 25:
                return new zzen[i];
            case 26:
                return new zzep[i];
            case 27:
                return new zzer[i];
            case 28:
                return new zzet[i];
            case 29:
                return new zzev[i];
            case 30:
                return new zzex[i];
            case 31:
                return new zzez[i];
            case 32:
                return new zzfb[i];
            case 33:
                return new zzfd[i];
            case 34:
                return new zzff[i];
            case 35:
                return new zzfh[i];
            case 36:
                return new zzfj[i];
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginLeft /* 37 */:
                return new zzjs[i];
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginRight /* 38 */:
                return new zzf[i];
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginTop /* 39 */:
                return new zzgp[i];
            case 40:
                return new zzhf[i];
            case R.styleable.maplibre_MapView_maplibre_uiHorizontalScrollGestures /* 41 */:
                return new zzhg[i];
            case 42:
                return new zzhi[i];
            case R.styleable.maplibre_MapView_maplibre_uiLogoGravity /* 43 */:
                return new zzhk[i];
            case 44:
                return new zzhm[i];
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginLeft /* 45 */:
                return new zzho[i];
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginRight /* 46 */:
                return new zzhs[i];
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginTop /* 47 */:
                return new zzhu[i];
            case 48:
                return new zzhw[i];
            case R.styleable.maplibre_MapView_maplibre_uiRotateGestures /* 49 */:
                return new zzhy[i];
            case 50:
                return new zzh[i];
            case R.styleable.maplibre_MapView_maplibre_uiTiltGestures /* 51 */:
                return new zzic[i];
            case 52:
                return new zzk[i];
            case 53:
                return new zzn[i];
            case 54:
                return new zzq[i];
            case 55:
                return new zzs[i];
            case 56:
                return new zzu[i];
            case 57:
                return new zzx[i];
            case 58:
                return new AppTheme[i];
            case 59:
                return new ConnectionConfiguration[i];
            case 60:
                return new com.google.android.gms.wearable.zzf[i];
            case 61:
                return new com.google.android.gms.wearable.zzh[i];
            case HatchMessageShareDocumentRenderer.TABLE_MIN_ROW_HEIGHT_PX /* 62 */:
                return new ReviewInfo[i];
            case 63:
                return new zzm[i];
            case 64:
                return new RemoteMessage[i];
            case LinkEncryptedPairingKt.LINK_PUBLIC_KEY_SIZE /* 65 */:
                return new CdsBottomSheetDimmingBehaviour.Default[i];
            case 66:
                return new CdsBottomSheetDimmingBehaviour.FixedAlpha[i];
            case MessageDraftSenderKt.UNICODE_MULTIPART_CHARS /* 67 */:
                return new CdsBottomSheetTopSpan.Dp[i];
            case 68:
                return new CdsBottomSheetTopSpan.ScreenPercent[i];
            case 69:
                return new CdsOpenScreenConfig$BottomSheetMargins[i];
            default:
                return BV4.A1W();
        }
    }
}
