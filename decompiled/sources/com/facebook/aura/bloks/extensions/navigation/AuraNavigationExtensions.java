package com.facebook.aura.bloks.extensions.navigation;

import X.AbstractC07378iq;
import X.AbstractC10476Hkp;
import X.AbstractC7608F5v;
import X.AbstractC7609F5w;
import X.AbstractC7691FAk;
import X.AbstractC8330Fbx;
import X.AbstractC8571FgQ;
import X.AnonymousClass000;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BV4;
import X.C3cG;
import X.C7384Etj;
import X.C7729FCg;
import X.C77m;
import X.C7943FLu;
import X.C7Je;
import X.C7VN;
import X.C8573FgU;
import X.C8588Fgn;
import X.C9115Fyg;
import X.CFK;
import X.F6D;
import X.F6L;
import X.FBB;
import X.FBD;
import X.FDW;
import X.FFI;
import X.FM2;
import X.FMF;
import X.FNH;
import X.FT4;
import X.Hj6;
import X.HlZ;
import X.HoH;
import X.HsM;
import X.Hx6;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.util.Pair;
import android.util.SparseArray;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.aura.R;
import com.facebook.aura.bloks.bottomsheet.AuraBloksBottomSheetComponentContent;
import com.facebook.aura.bloks.bottomsheet.AuraBloksBottomSheetData;
import com.facebook.aura.bloks.bottomsheet.AuraBloksBottomSheetFragment;
import com.facebook.aura.bloks.bottomsheet.AuraBloksBottomSheetHeaderData;
import com.facebook.aura.bloks.bottomsheet.AuraBloksBottomSheetStateHolder;
import com.facebook.aura.bloks.host.AuraBloksHost;
import com.facebook.aura.identity.datr.AuraDatrDeviceIdentityBridge;
import com.facebook.aura.utils.navigation.MetaWebUrlLocalizerKt;
import com.facebook.aura.utils.navigation.SecureUri;
import com.facebook.aura.utils.navigation.SecureUriKt;
import com.instagram.common.bloks.BloksParseResult;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Map;
import java.util.TimeZone;
import libraries.fxmetalogin.webauth.MetaWebAuthenticationActivity;

/* loaded from: classes6.dex */
public final class AuraNavigationExtensions {
    public static final AuraNavigationExtensions INSTANCE = new AuraNavigationExtensions();
    public static final String TAG = "AuraNavigationExtensions";

    public static final C7943FLu A01(FBB fbb, F6D f6d, FDW fdw) {
        SparseArray sparseArrayA0B = null;
        if (fdw == null) {
            return null;
        }
        String strA0v = AbstractC7608F5v.A0v(fdw);
        if (strA0v != null) {
            sparseArrayA0B = BV4.A0B();
            sparseArrayA0B.append(R.id.testing_id_view_tag_key, strA0v);
        }
        FDW fdwA0C = fdw.A0C(48);
        if (fdwA0C != null) {
            String strA0p = AbstractC7608F5v.A0p(fdwA0C);
            if (strA0p != null && strA0p.length() != 0) {
                try {
                    Color.parseColor(strA0p);
                } catch (IllegalArgumentException unused) {
                }
            }
            String strA0o = AbstractC7608F5v.A0o(fdwA0C);
            if (strA0o != null && strA0o.length() != 0) {
                try {
                    Color.parseColor(strA0o);
                } catch (IllegalArgumentException unused2) {
                }
            }
        }
        String strA0p2 = AbstractC7608F5v.A0p(fdw);
        String str = strA0p2 != null ? strA0p2 : "";
        HlZ hlZ = new HlZ(fbb, f6d, fdw);
        String strA0r = AbstractC7608F5v.A0r(fdw);
        return new C7943FLu(hlZ, sparseArrayA0B, str, strA0r != null ? strA0r : "default");
    }

    public final Object closeScreen(FBD fbd, F6L f6l, Hj6 hj6) {
        C8573FgU c8573FgU;
        AnonymousClass002.A1A(fbd, 0, hj6);
        AuraBloksHost auraBloksHost = (AuraBloksHost) fbd;
        AbstractC8571FgQ abstractC8571FgQ = auraBloksHost.mFragmentManager;
        if (abstractC8571FgQ == null) {
            throw BV4.A0U();
        }
        Object obj = hj6.A01[0];
        C7384Etj.A0U(obj);
        FDW fdw = (FDW) obj;
        String strA0o = AbstractC7608F5v.A0o(fdw);
        if (strA0o != null) {
            boolean zA0L = fdw.A0L(36, false);
            for (int iA0R = abstractC8571FgQ.A0R() - 1; -1 < iA0R; iA0R--) {
                ArrayList<C8573FgU> arrayList = abstractC8571FgQ.A0D;
                if (iA0R == arrayList.size()) {
                    c8573FgU = abstractC8571FgQ.A05;
                    if (c8573FgU == null) {
                        throw new IndexOutOfBoundsException();
                    }
                } else {
                    c8573FgU = arrayList.get(iA0R);
                }
                if (strA0o.equals(c8573FgU.A09)) {
                    if (!zA0L) {
                        abstractC8571FgQ.A0p(new FNH(abstractC8571FgQ, strA0o, -1, 1), false);
                    } else if (iA0R != 0) {
                        abstractC8571FgQ.A0p(new FNH(abstractC8571FgQ, strA0o, -1, 1), false);
                        abstractC8571FgQ.A0d();
                    }
                }
            }
            return null;
        }
        if (abstractC8571FgQ.A0R() > 1) {
            abstractC8571FgQ.A0d();
            return null;
        }
        FragmentActivity fragmentActivity = auraBloksHost.mFragmentActivity;
        if (fragmentActivity == null) {
            return null;
        }
        fragmentActivity.finish();
        return null;
    }

    public final Object deeplinkToOtherAppOrDirectToAppStore(F6D f6d, Hj6 hj6) {
        boolean zA1a = AnonymousClass002.A1a(f6d, hj6);
        Object[] objArr = hj6.A01;
        String str = (String) objArr[0];
        String str2 = (String) objArr[zA1a ? 1 : 0];
        FBB fbb = f6d.A02;
        String queryParameter = null;
        Context context = fbb != null ? fbb.A00 : null;
        if (context == null) {
            CFK.A04(TAG, "Bloks context null while evaluating BKBloksActionDeeplinkToOtherAppOrDirectToAppStoreImpl");
        } else {
            if (str2 != null) {
                int length = str2.length() - (zA1a ? 1 : 0);
                int i = 0;
                boolean z = false;
                while (i <= length) {
                    int i2 = length;
                    if (!z) {
                        i2 = i;
                    }
                    boolean z2 = str2.charAt(i2) <= ' ';
                    if (z) {
                        if (!z2) {
                            break;
                        }
                        length--;
                    } else if (z2) {
                        i++;
                    } else {
                        z = true;
                    }
                }
                if (str2.subSequence(i, length + 1).toString().length() > 0) {
                    Uri uriA01 = C7Je.A01(str2);
                    C7384Etj.A0U(uriA01);
                    queryParameter = uriA01.getQueryParameter("id");
                }
            }
            C7384Etj.A0X(str);
            if (!AbstractC07378iq.A01(context, TAG, str, queryParameter)) {
                AbstractC07378iq.A00(context, TAG, str2);
            }
        }
        return C3cG.A0T();
    }

    public final Object dismissBottomSheet(FBD fbd, F6D f6d, Hj6 hj6) {
        C7384Etj.A0Y(fbd, 0);
        final FragmentActivity fragmentActivity = ((AuraBloksHost) fbd).mFragmentActivity;
        if (fragmentActivity != null) {
            fragmentActivity.runOnUiThread(new Runnable() { // from class: com.facebook.aura.bloks.extensions.navigation.AuraNavigationExtensions$dismissBottomSheet$1$1
                @Override // java.lang.Runnable
                public final void run() {
                    Fragment fragmentA0U = AbstractC8330Fbx.A00(fragmentActivity).A0U(AuraNavigationExtensionsKt.BOTTOMSHEET_FRAGMENT_TAG);
                    if (fragmentA0U != null) {
                        C8573FgU c8573FgU = new C8573FgU(AbstractC8330Fbx.A00(fragmentActivity));
                        c8573FgU.A06(fragmentA0U);
                        c8573FgU.A03(false, true);
                    }
                }
            });
        }
        return C3cG.A0T();
    }

    public final Object openBottomSheetV2(FBD fbd, F6D f6d, Hj6 hj6) {
        boolean zA1Z = AnonymousClass005.A1Z(fbd, f6d, hj6);
        AuraBloksHost auraBloksHost = (AuraBloksHost) fbd;
        FBB fbb = f6d.A02;
        if (fbb != null) {
            Pair<FDW, BloksParseResult> pairA00 = A00((BloksParseResult) hj6.A01[0]);
            HsM hsMA0D = ((FDW) pairA00.first).A0D(38);
            Map mapA01 = AbstractC10476Hkp.A01(f6d, (FDW) pairA00.first, 65);
            Context context = fbb.A00;
            BloksParseResult bloksParseResult = (BloksParseResult) pairA00.second;
            FBD fbd2 = fbb.A02;
            Map map = Collections.EMPTY_MAP;
            SparseArray sparseArrayA0B = BV4.A0B();
            context.getClass();
            bloksParseResult.getClass();
            C7729FCg c7729FCg = new C7729FCg(context, sparseArrayA0B, bloksParseResult, fbd2, mapA01, map);
            AuraBloksBottomSheetHeaderData.Companion companion = AuraBloksBottomSheetHeaderData.Companion;
            Object obj = pairA00.first;
            C7384Etj.A0T(obj);
            AuraBloksBottomSheetHeaderData auraBloksBottomSheetHeaderDataFromBloksBottomSheetContribs = companion.fromBloksBottomSheetContribs((FDW) obj);
            launchBottomSheet(auraBloksHost.mFragmentActivity, context, new AuraBloksBottomSheetData(auraBloksBottomSheetHeaderDataFromBloksBottomSheetContribs.copy(auraBloksBottomSheetHeaderDataFromBloksBottomSheetContribs.title, zA1Z, auraBloksBottomSheetHeaderDataFromBloksBottomSheetContribs.bloksModel), new AuraBloksBottomSheetComponentContent(c7729FCg), zA1Z, hsMA0D != null ? new AuraNavigationExtensions$openBottomSheetV2$onDismissCallback$1$1(hsMA0D, f6d) : null));
        }
        return C3cG.A0T();
    }

    public final Object openDateTimePicker(F6D f6d, Hj6 hj6) {
        boolean z;
        Calendar calendar;
        boolean z2;
        boolean zA1a = AnonymousClass002.A1a(f6d, hj6);
        HsM hsMA0B = C7384Etj.A0B(hj6.A01, 0);
        FDW fdwA0h = AbstractC7609F5w.A0h(hj6, zA1a ? 1 : 0);
        FBB fbbA04 = f6d.A04();
        Object[] objArr = hj6.A01;
        Number number = (Number) objArr[3];
        String str = (String) objArr[4];
        Number number2 = (Number) objArr[5];
        Number number3 = (Number) objArr[6];
        HsM hsM = (HsM) objArr[7];
        C7384Etj.A0X(fdwA0h);
        FM2 fm2 = new FM2();
        Long lValueOf = number != null ? Long.valueOf(number.longValue()) : null;
        Long lValueOf2 = number2 != null ? Long.valueOf(number2.longValue()) : null;
        Long lValueOf3 = number3 != null ? Long.valueOf(number3.longValue()) : null;
        Context contextA00 = FBB.A00(fbbA04);
        String strA0p = AbstractC7608F5v.A0p(fdwA0h);
        String str2 = strA0p != null ? strA0p : "date";
        String strA0o = AbstractC7608F5v.A0o(fdwA0h);
        String str3 = strA0o != null ? strA0o : "calendar";
        Calendar calendar2 = str != null ? Calendar.getInstance(TimeZone.getTimeZone(str)) : Calendar.getInstance();
        if (lValueOf != null) {
            calendar2.setTimeInMillis(lValueOf.longValue() * 1000);
        }
        int iHashCode = str2.hashCode();
        if (iHashCode != -1160567386) {
            if (iHashCode != 3076014) {
                if (iHashCode == 3560141 && str2.equals("time")) {
                    C7384Etj.A0X(calendar2);
                    FMF.A03(contextA00, fbbA04, f6d, hsMA0B, hsM, calendar2, fbbA04.A05);
                }
            } else if (str2.equals("date")) {
                C7384Etj.A0X(calendar2);
                z = fbbA04.A05;
                calendar = calendar2;
                z2 = false;
                FMF.A02(contextA00, fm2, fbbA04, f6d, hsMA0B, hsM, lValueOf2, lValueOf3, str3, str, calendar, z2, z);
            }
            FFI.A03("Unexpected picker mode: ", str2);
        } else {
            if (str2.equals("date_and_time")) {
                C7384Etj.A0X(calendar2);
                z = fbbA04.A05;
                calendar = calendar2;
                z2 = zA1a ? 1 : 0;
                FMF.A02(contextA00, fm2, fbbA04, f6d, hsMA0B, hsM, lValueOf2, lValueOf3, str3, str, calendar, z2, z);
            }
            FFI.A03("Unexpected picker mode: ", str2);
        }
        return C3cG.A0T();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void openFoADialog(X.FBD r13, X.F6D r14, X.Hj6 r15) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.bloks.extensions.navigation.AuraNavigationExtensions.openFoADialog(X.FBD, X.F6D, X.Hj6):void");
    }

    public static Pair<FDW, BloksParseResult> A00(BloksParseResult bloksParseResult) {
        FDW fdw = bloksParseResult.A02;
        FDW fdw2 = (FDW) FDW.A01(fdw, 35);
        if (fdw2 != null) {
            return new Pair<>(fdw, new BloksParseResult(null, bloksParseResult.A01, fdw2, bloksParseResult.mLoggingId));
        }
        throw C3cG.A0Q("Null content for BottomSheet");
    }

    private final void launchBottomSheet(final FragmentActivity fragmentActivity, Context context, final AuraBloksBottomSheetData auraBloksBottomSheetData) {
        if (fragmentActivity != null) {
            fragmentActivity.runOnUiThread(new Runnable() { // from class: com.facebook.aura.bloks.extensions.navigation.AuraNavigationExtensions$launchBottomSheet$1$1
                @Override // java.lang.Runnable
                public final void run() {
                    Fragment fragmentA0U = AbstractC8330Fbx.A00(fragmentActivity).A0U(AuraNavigationExtensionsKt.BOTTOMSHEET_FRAGMENT_TAG);
                    if (fragmentA0U != null) {
                        C8573FgU c8573FgU = new C8573FgU(AbstractC8330Fbx.A00(fragmentActivity));
                        c8573FgU.A06(fragmentA0U);
                        c8573FgU.A00();
                        c8573FgU.A02.A0q(c8573FgU, false);
                    }
                    AuraBloksBottomSheetFragment auraBloksBottomSheetFragmentNewInstance = AuraBloksBottomSheetFragment.Companion.newInstance(auraBloksBottomSheetData);
                    C8573FgU c8573FgU2 = new C8573FgU(AbstractC8330Fbx.A00(fragmentActivity));
                    c8573FgU2.A01(auraBloksBottomSheetFragmentNewInstance, AuraNavigationExtensionsKt.BOTTOMSHEET_FRAGMENT_TAG, android.R.id.content, 1);
                    if (!c8573FgU2.A0F) {
                        throw C3cG.A0Q("This FragmentTransaction is not allowed to be added to the back stack.");
                    }
                    c8573FgU2.A0E = true;
                    c8573FgU2.A09 = null;
                    c8573FgU2.A03(true, true);
                }
            });
        }
    }

    private final void pushBottomSheet(FragmentActivity fragmentActivity, Context context, AuraBloksBottomSheetData auraBloksBottomSheetData) {
        if (fragmentActivity != null) {
            if (AbstractC8330Fbx.A00(fragmentActivity).A0U(AuraNavigationExtensionsKt.BOTTOMSHEET_FRAGMENT_TAG) == null) {
                INSTANCE.launchBottomSheet(fragmentActivity, context, auraBloksBottomSheetData);
            } else {
                AuraBloksBottomSheetStateHolder.instance.addBottomSheetData(auraBloksBottomSheetData);
            }
        }
    }

    public final Object pushBottomSheetV2(FBD fbd, F6D f6d, Hj6 hj6) {
        AnonymousClass005.A0x(fbd, f6d, hj6);
        AuraBloksHost auraBloksHost = (AuraBloksHost) fbd;
        FBB fbb = f6d.A02;
        if (fbb != null) {
            Object[] objArr = hj6.A01;
            BloksParseResult bloksParseResult = (BloksParseResult) objArr[0];
            boolean zA01 = HoH.A01(objArr[1]);
            if (bloksParseResult != null) {
                Pair<FDW, BloksParseResult> pairA00 = A00(bloksParseResult);
                HsM hsMA0D = ((FDW) pairA00.first).A0D(38);
                Map mapA01 = AbstractC10476Hkp.A01(f6d, (FDW) pairA00.first, 65);
                Context context = fbb.A00;
                BloksParseResult bloksParseResult2 = (BloksParseResult) pairA00.second;
                FBD fbd2 = fbb.A02;
                Map map = Collections.EMPTY_MAP;
                SparseArray sparseArrayA0B = BV4.A0B();
                context.getClass();
                bloksParseResult2.getClass();
                C7729FCg c7729FCg = new C7729FCg(context, sparseArrayA0B, bloksParseResult2, fbd2, mapA01, map);
                AuraNavigationExtensions$pushBottomSheetV2$onDismissCallback$1$1 auraNavigationExtensions$pushBottomSheetV2$onDismissCallback$1$1 = hsMA0D != null ? new AuraNavigationExtensions$pushBottomSheetV2$onDismissCallback$1$1(hsMA0D, f6d) : null;
                FragmentActivity fragmentActivity = auraBloksHost.mFragmentActivity;
                AuraBloksBottomSheetHeaderData.Companion companion = AuraBloksBottomSheetHeaderData.Companion;
                Object obj = pairA00.first;
                C7384Etj.A0T(obj);
                pushBottomSheet(fragmentActivity, context, new AuraBloksBottomSheetData(companion.fromBloksBottomSheetContribs((FDW) obj), new AuraBloksBottomSheetComponentContent(c7729FCg), zA01, auraNavigationExtensions$pushBottomSheetV2$onDismissCallback$1$1));
            }
        }
        return C3cG.A0T();
    }

    public final Object exitLinkingFlow(FBD fbd, F6D f6d, Hj6 hj6) {
        String str;
        AnonymousClass005.A0x(fbd, f6d, hj6);
        FragmentActivity fragmentActivity = ((AuraBloksHost) fbd).mFragmentActivity;
        if (fragmentActivity == null) {
            str = "Activity is Null!";
        } else {
            C7384Etj.A0U(AbstractC8330Fbx.A00(fragmentActivity));
            str = "Listener is null";
        }
        CFK.A04(TAG, str);
        return C3cG.A0T();
    }

    public final Object openInBrowser(F6D f6d, Hj6 hj6) {
        AnonymousClass003.A0u(f6d, hj6);
        String str = (String) hj6.A01[0];
        C7384Etj.A0X(str);
        SecureUri secureUriAsSecureUri = SecureUriKt.asSecureUri(str);
        FBB fbb = f6d.A02;
        if (fbb != null) {
            SecureUriKt.openInBrowser(secureUriAsSecureUri, FBB.A00(fbb));
        }
        return C3cG.A0T();
    }

    public final Object openUrlInIAB(F6D f6d, Hj6 hj6) {
        AnonymousClass003.A0u(f6d, hj6);
        String str = (String) hj6.A01[0];
        C7384Etj.A0X(str);
        SecureUri secureUriAsSecureUri = SecureUriKt.asSecureUri(str);
        FBB fbb = f6d.A02;
        if (fbb != null) {
            SecureUriKt.openInApp(secureUriAsSecureUri, FBB.A00(fbb));
        }
        return C3cG.A0T();
    }

    public final Object openUrlLink(FBD fbd, F6L f6l, Hj6 hj6) {
        AnonymousClass003.A0v(fbd, hj6);
        String str = (String) hj6.A01[0];
        FragmentActivity fragmentActivity = ((AuraBloksHost) fbd).mFragmentActivity;
        if (fragmentActivity == null) {
            CFK.A04(TAG, "Activity is Null!");
        } else {
            Uri uriA01 = C7Je.A01(str);
            C7384Etj.A0U(uriA01);
            if ("meta-ai".equals(uriA01.getScheme())) {
                Intent flags = new Intent(AnonymousClass000.A00(26), C7Je.A01(str)).setFlags(65536);
                C7384Etj.A0U(flags);
                C77m.A00(fragmentActivity, flags);
            } else {
                AuraDatrDeviceIdentityBridge.INSTANCE.prepare();
                new C7VN().A02().A00(fragmentActivity, MetaWebUrlLocalizerKt.localizedForDevice(uriA01, fragmentActivity));
            }
        }
        return C3cG.A0T();
    }

    public final Object openUrlWebAuthData(FBD fbd, final F6D f6d, final Hj6 hj6) {
        AnonymousClass005.A0x(fbd, f6d, hj6);
        FragmentActivity fragmentActivity = ((AuraBloksHost) fbd).mFragmentActivity;
        if (fragmentActivity == null) {
            CFK.A04(TAG, "Activity is Null!");
        } else {
            Object obj = hj6.A01[0];
            C8588Fgn c8588FgnA02 = fragmentActivity.activityResultRegistry.A02(new FT4() { // from class: com.facebook.aura.bloks.extensions.navigation.AuraNavigationExtensions$openUrlWebAuthData$launcher$2
                @Override // X.FT4
                public final void onActivityResult(Uri uri) {
                    AbstractC7691FAk.A00(f6d, C9115Fyg.A03(C9115Fyg.A00(), uri != null ? uri.toString() : null, 0), C7384Etj.A0B(hj6.A01, 2));
                }
            }, new Hx6<String, Uri>() { // from class: com.facebook.aura.bloks.extensions.navigation.AuraNavigationExtensions$openUrlWebAuthData$launcher$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // X.Hx6
                public Uri parseResult(int i, Intent intent) {
                    String stringExtra;
                    if (intent == null || i != -1 || (stringExtra = intent.getStringExtra("CALLBACK_URI_KEY")) == null) {
                        return null;
                    }
                    return C7Je.A01(stringExtra);
                }

                @Override // X.Hx6
                public Intent createIntent(Context context, String str) {
                    AnonymousClass003.A0u(context, str);
                    Intent intent = new Intent(context, (Class<?>) MetaWebAuthenticationActivity.class);
                    intent.putExtra("BASE_URI", str);
                    return intent;
                }
            }, "web_auth");
            C7384Etj.A0X(obj);
            c8588FgnA02.A01(null, obj);
        }
        return C3cG.A0T();
    }
}
