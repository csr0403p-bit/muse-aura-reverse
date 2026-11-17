package X;

import com.facebook.acra.util.minidump.MinidumpReader;
import com.facebook.aura.commands.sms.MessageDraftSenderKt;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import java.util.ArrayList;

/* renamed from: X.Fl2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8802Fl2 {
    public float[] A00 = new float[64];

    /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/String;Ljava/util/ArrayList<LX/Fld;>;)Ljava/util/ArrayList<LX/Fld;>; */
    public static final void A00(C8802Fl2 c8802Fl2, String str, ArrayList arrayList) {
        int i;
        boolean zIsNaN;
        int length = str.length();
        int i2 = 0;
        while (i2 < length && C7384Etj.A00(str.charAt(i2), 32) <= 0) {
            i2++;
        }
        while (length > i2 && C7384Etj.A00(str.charAt(length - 1), 32) <= 0) {
            length--;
        }
        int i3 = 0;
        while (i2 < length) {
            while (true) {
                i = i2 + 1;
                char cCharAt = str.charAt(i2);
                int i4 = cCharAt | ' ';
                if ((i4 - 97) * (i4 - 122) > 0 || i4 == 101) {
                    i2 = i;
                    if (i >= length) {
                        break;
                    }
                } else if (cCharAt == 0) {
                    continue;
                } else {
                    int i5 = cCharAt | ' ';
                    if (i5 != 122) {
                        while (i < length && C7384Etj.A00(str.charAt(i), 32) <= 0) {
                            i++;
                        }
                        boolean z = i5 == 97;
                        i3 = 0;
                        do {
                            long jA00 = (!z || 3 > i3 || i3 >= 5) ? HjO.A00(str, i, length) : HjO.A00(str, i, Math.min(i + 1, length));
                            i = (int) (jA00 >>> 32);
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (jA00 & 4294967295L));
                            zIsNaN = Float.isNaN(fIntBitsToFloat);
                            if (!zIsNaN) {
                                float[] fArr = c8802Fl2.A00;
                                int i6 = i3 + 1;
                                fArr[i3] = fIntBitsToFloat;
                                if (i6 >= fArr.length) {
                                    float[] fArr2 = new float[i6 * 2];
                                    c8802Fl2.A00 = fArr2;
                                    System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                                }
                                i3 = i6;
                            }
                            while (i < length && (C7384Etj.A00(str.charAt(i), 32) <= 0 || str.charAt(i) == ',')) {
                                i++;
                            }
                            if (i < length) {
                            }
                        } while (!zIsNaN);
                    }
                    float[] fArr3 = c8802Fl2.A00;
                    int i7 = 0;
                    switch (cCharAt) {
                        case LinkEncryptedPairingKt.LINK_PUBLIC_KEY_SIZE /* 65 */:
                            int i8 = i3 - 7;
                            while (i7 <= i8) {
                                float f = fArr3[i7];
                                float f2 = fArr3[i7 + 1];
                                float f3 = fArr3[i7 + 2];
                                boolean z2 = Float.compare(fArr3[i7 + 3], 0.0f) != 0;
                                boolean z3 = false;
                                if (Float.compare(fArr3[i7 + 4], 0.0f) != 0) {
                                    z3 = true;
                                }
                                arrayList.add(new C8806FlK(f, f2, f3, fArr3[i7 + 5], fArr3[i7 + 6], z2, z3));
                                i7 += 7;
                            }
                            break;
                        case MessageDraftSenderKt.UNICODE_MULTIPART_CHARS /* 67 */:
                            int i9 = i3 - 6;
                            while (i7 <= i9) {
                                arrayList.add(new C8808FlM(fArr3[i7], fArr3[i7 + 1], fArr3[i7 + 2], fArr3[i7 + 3], fArr3[i7 + 4], fArr3[i7 + 5]));
                                i7 += 6;
                            }
                            break;
                        case 'H':
                            int i10 = i3 - 1;
                            while (i7 <= i10) {
                                arrayList.add(new C8820FlY(fArr3[i7]));
                                i7++;
                            }
                            break;
                        case HatchIdeaShareImageRenderer.TEXT_LEFT /* 76 */:
                            int i11 = i3 - 2;
                            while (i7 <= i11) {
                                arrayList.add(new C8814FlS(fArr3[i7], fArr3[i7 + 1]));
                                i7 += 2;
                            }
                            break;
                        case HatchMessageShareDocumentRenderer.APP_ICON_SIZE_PX /* 77 */:
                            int i12 = i3 - 2;
                            if (i12 >= 0) {
                                arrayList.add(new C8815FlT(fArr3[0], fArr3[1]));
                                for (int i13 = 2; i13 <= i12; i13 += 2) {
                                    arrayList.add(new C8814FlS(fArr3[i13], fArr3[i13 + 1]));
                                }
                                break;
                            } else {
                                break;
                            }
                        case 'Q':
                            int i14 = i3 - 4;
                            while (i7 <= i14) {
                                arrayList.add(new C8809FlN(fArr3[i7], fArr3[i7 + 1], fArr3[i7 + 2], fArr3[i7 + 3]));
                                i7 += 4;
                            }
                            break;
                        case 'S':
                            int i15 = i3 - 4;
                            while (i7 <= i15) {
                                arrayList.add(new C8810FlO(fArr3[i7], fArr3[i7 + 1], fArr3[i7 + 2], fArr3[i7 + 3]));
                                i7 += 4;
                            }
                            break;
                        case 'T':
                            int i16 = i3 - 2;
                            while (i7 <= i16) {
                                arrayList.add(new C8816FlU(fArr3[i7], fArr3[i7 + 1]));
                                i7 += 2;
                            }
                            break;
                        case 'V':
                            int i17 = i3 - 1;
                            while (i7 <= i17) {
                                arrayList.add(new C8823Flb(fArr3[i7]));
                                i7++;
                            }
                            break;
                        case 'Z':
                        case 'z':
                            arrayList.add(C8824Flc.A00);
                            break;
                        case 'a':
                            int i18 = i3 - 7;
                            while (i7 <= i18) {
                                float f4 = fArr3[i7];
                                float f5 = fArr3[i7 + 1];
                                float f6 = fArr3[i7 + 2];
                                boolean z4 = Float.compare(fArr3[i7 + 3], 0.0f) != 0;
                                boolean z5 = false;
                                if (Float.compare(fArr3[i7 + 4], 0.0f) != 0) {
                                    z5 = true;
                                }
                                arrayList.add(new C8807FlL(f4, f5, f6, fArr3[i7 + 5], fArr3[i7 + 6], z4, z5));
                                i7 += 7;
                            }
                            break;
                        case 'c':
                            int i19 = i3 - 6;
                            while (i7 <= i19) {
                                arrayList.add(new C8811FlP(fArr3[i7], fArr3[i7 + 1], fArr3[i7 + 2], fArr3[i7 + 3], fArr3[i7 + 4], fArr3[i7 + 5]));
                                i7 += 6;
                            }
                            break;
                        case 'h':
                            int i20 = i3 - 1;
                            while (i7 <= i20) {
                                arrayList.add(new C8821FlZ(fArr3[i7]));
                                i7++;
                            }
                            break;
                        case MinidumpReader.MODULE_FULL_SIZE /* 108 */:
                            int i21 = i3 - 2;
                            while (i7 <= i21) {
                                arrayList.add(new C8817FlV(fArr3[i7], fArr3[i7 + 1]));
                                i7 += 2;
                            }
                            break;
                        case 'm':
                            int i22 = i3 - 2;
                            if (i22 >= 0) {
                                arrayList.add(new C8818FlW(fArr3[0], fArr3[1]));
                                for (int i23 = 2; i23 <= i22; i23 += 2) {
                                    arrayList.add(new C8817FlV(fArr3[i23], fArr3[i23 + 1]));
                                }
                                break;
                            } else {
                                break;
                            }
                        case 'q':
                            int i24 = i3 - 4;
                            while (i7 <= i24) {
                                arrayList.add(new C8812FlQ(fArr3[i7], fArr3[i7 + 1], fArr3[i7 + 2], fArr3[i7 + 3]));
                                i7 += 4;
                            }
                            break;
                        case 's':
                            int i25 = i3 - 4;
                            while (i7 <= i25) {
                                arrayList.add(new C8813FlR(fArr3[i7], fArr3[i7 + 1], fArr3[i7 + 2], fArr3[i7 + 3]));
                                i7 += 4;
                            }
                            break;
                        case 't':
                            int i26 = i3 - 2;
                            while (i7 <= i26) {
                                arrayList.add(new C8819FlX(fArr3[i7], fArr3[i7 + 1]));
                                i7 += 2;
                            }
                            break;
                        case 'v':
                            int i27 = i3 - 1;
                            while (i7 <= i27) {
                                arrayList.add(new C8822Fla(fArr3[i7]));
                                i7++;
                            }
                            break;
                        default:
                            throw C60O.A0i(FGI.A0E("Unknown command for: ", cCharAt));
                    }
                }
            }
            i2 = i;
        }
    }
}
