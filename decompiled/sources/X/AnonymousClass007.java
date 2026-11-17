package X;

import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.aura.activation.view.AuraInviteFriendSheetKt;
import com.facebook.aura.agentpermission.DevicePermissionManageControllerKt$rememberDevicePermissionLauncher$2$1;
import com.facebook.aura.analytics.hatch.HatchInteractionEnumsKt;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.common.prefs.HatchDeveloperPrefs;
import com.facebook.aura.conversation.view.richcontent.LocalIsPrimaryThreadKt;
import com.facebook.aura.conversation.viewmodel.HatchConversationListItem;
import com.facebook.aura.executors.AuraDispatchers;
import com.facebook.aura.explore.view.HatchIdeasTabScreenKt$ideaListSection$1$1;
import com.facebook.aura.identity.provider.HatchIdentityProvider;
import com.facebook.aura.session.LocalUserSessionKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.skills.repo.HatchConnectorCatalogRepository;
import com.facebook.aura.tabs.AuraTabItem;
import com.facebook.aura.ui.HatchSectionKt;
import com.facebook.aura.utils.HatchPermissionUtils;
import com.facebook.aura.vds.compose.button.AuraButtonDefaults;
import com.facebook.aura.vds.compose.button.IconContext;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupScope;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupsKt;
import com.facebook.aura.vds.compose.card.AuraCardDefaults;
import com.facebook.aura.vds.compose.card.AuraRadioTapOption;
import com.facebook.aura.vds.compose.header.AuraSectionHeaderKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.image.AuraRetryViewKt;
import com.facebook.aura.vds.compose.input.AuraTextInputDefaults;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerKt;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerStyle;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode;
import com.facebook.aura.vds.compose.toast.AuraToastOption;
import com.facebook.aura.vds.compose.typegroup.AuraHeadlineAndBodyColors;
import com.facebook.aura.vds.compose.typegroup.AuraHeadlineAndBodyDefaults;
import com.facebook.aura.vds.toast.AuraToast;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.007, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class AnonymousClass007 {
    public static int A09(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        return C7BY.A0C(str, str2, str.length() - 1, false);
    }

    public static long A0C(int i, int i2) {
        return (i << 32) | (i2 & 4294967295L);
    }

    public static SnapshotStateList A0F(BFM bfm, List list) {
        AuraRadioTapOption[] auraRadioTapOptionArr = (AuraRadioTapOption[]) list.toArray(new AuraRadioTapOption[0]);
        Object[] objArrCopyOf = Arrays.copyOf(auraRadioTapOptionArr, auraRadioTapOptionArr.length);
        SnapshotStateList snapshotStateList = new SnapshotStateList();
        snapshotStateList.addAll(BFI.A0G(objArrCopyOf));
        bfm.Ai0(snapshotStateList);
        return snapshotStateList;
    }

    public static BRg A0H(BFM bfm, BRg bRg, BRg bRg2) {
        return AbstractC1103AYp.A02(AbstractC1103AYp.A00(0, bfm, 0, 1), bRg.then(bRg2), true);
    }

    public static Object A0W(BRr bRr, HtJ htJ, G0U g0u) {
        Object objA06 = TapGestureDetectorKt.A06(bRr, htJ, null, null, g0u, TapGestureDetectorKt.A00);
        return objA06 != EnumC10460Hji.A02 ? Unit.INSTANCE : objA06;
    }

    public static Locale A0b(BFM bfm) {
        return ((Configuration) bfm.A6v(AndroidCompositionLocals_androidKt.A00)).getLocales().get(0);
    }

    public static G0V A0j(BFM bfm, int i) {
        AuraSectionHeaderKt.AuraSectionHeader(AbstractC2271BQs.A01(bfm, i), null, null, bfm, 48, 4);
        return null;
    }

    public static HzC A0k() {
        return Hxb.A02(new C8eO(null).plus(AuraDispatchers.INSTANCE.io()));
    }

    public static void A0l(View view, AuraToast.Companion companion, AuraToast.Duration duration, String str) {
        AuraToast auraToastM3114makeKDArT4I = companion.m3114makeKDArT4I(view, str, null, duration, null, AuraToastOption.None.INSTANCE, null, false, null, AuraThemeMode.DEFAULT, null, null, false, false, null, null, null, AuraIconSize.MEDIUM, null);
        if (auraToastM3114makeKDArT4I != null) {
            auraToastM3114makeKDArT4I.show();
        }
    }

    public static void A0m(View view, AuraToast.Companion companion, String str) {
        AuraToast auraToastM3114makeKDArT4I = companion.m3114makeKDArT4I(view, str, null, AuraToast.Duration.SHORT, null, AuraToastOption.None.INSTANCE, null, false, null, AuraThemeMode.DEFAULT, null, null, false, false, null, null, null, AuraIconSize.MEDIUM, null);
        if (auraToastM3114makeKDArT4I != null) {
            auraToastM3114makeKDArT4I.show();
        }
    }

    public static void A0o(C07C c07c, BFM bfm, Object obj) {
        HatchSectionKt.m2326HatchSectionuDo3WH8(c07c, false, null, 0L, (G0U) obj, bfm, 6, 7);
    }

    public static void A0p(C07C c07c, BFM bfm, Object obj, int i) {
        HatchSectionKt.m2326HatchSectionuDo3WH8(c07c, false, null, 0L, (G0U) obj, bfm, i & 14, 7);
    }

    public static void A0q(C07C c07c, G0U g0u, BFM bfm, int i) {
        HatchSectionKt.m2326HatchSectionuDo3WH8(c07c, false, null, 0L, g0u, bfm, i, 7);
    }

    public static void A0r(BFM bfm, int i) {
        AuraSectionHeaderKt.AuraSectionHeader(AbstractC2271BQs.A01(bfm, i), null, null, bfm, 48, 4);
    }

    public static void A0s(BFM bfm, BBI bbi) {
        AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(null, null, 0L, bfm, 0, 7);
        BBI.A0R(bbi, true);
    }

    public static void A0t(BFM bfm, BBI bbi, BRg bRg) {
        AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(C0z7.A00.A4C(C2VU.A09, bRg), null, 0L, bfm, 0, 6);
        BBI.A0R(bbi, true);
    }

    public static void A0u(BFM bfm, BRg bRg) {
        AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(C10G.A08(C10G.A04(bRg, 16.0f), 16.0f), null, 0L, bfm, 6, 6);
    }

    public static void A0v(BFM bfm, BRg bRg, G0U g0u) {
        AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(ARD.A01(bRg, g0u, false), null, 0L, bfm, 0, 6);
    }

    public static void A10(BFM bfm, C1822Arm c1822Arm, String str, long j) {
        AuraTextKt.m2639AuraTextUY9GdpU(str, null, j, c1822Arm, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
    }

    public static void A11(BFM bfm, AuraCardDefaults auraCardDefaults, int i) {
        auraCardDefaults.m2478LeadingIcongKt5lHk(null, BOf.A00(bfm, i, 0), null, bfm, (AVy.$stable << 3) | 3072, 5);
    }

    public static void A13(BFM bfm, AuraTextInputDefaults auraTextInputDefaults, String str) {
        auraTextInputDefaults.m2587PlaceholderTextqdpcsU(str, 0, null, bfm, 3072, 6);
    }

    public static void A14(BFM bfm, Object obj) {
        AuraButtonGroupsKt.m2455AuraButtonGroupStyleExplicitFLdL6rA(null, null, null, null, null, null, null, false, (G0U) obj, bfm, 0, 255);
    }

    public static void A18(AuraButtonGroupScope auraButtonGroupScope, String str, Function0 function0) {
        auraButtonGroupScope.primaryButton(str, (Drawable) null, true, false, AuraButtonGroupsKt.DEFAULT_PRIMARY_BUTTON_ID, (Function0<Unit>) function0, (String) null, Integer.MAX_VALUE, (BRg) BRg.A00);
    }

    public static void A1C(boolean z, BFM bfm, int i) {
        if (bfm.AfS(i & 1, z)) {
            AuraRetryViewKt.AuraImageDefaultError(null, bfm, 0, 1);
        } else {
            bfm.Afo();
        }
    }

    public static float A01(Object obj) {
        return (int) (((AaN) obj).A00 >> 32);
    }

    public static int A02(int i, int i2) {
        return i2 | (458752 & i) | (i & 3670016);
    }

    public static int A03(int i, int i2) {
        return (i & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6 | ((i2 << 18) & 3670016);
    }

    public static int A07(B6A b6a) {
        if (b6a == null) {
            return 0;
        }
        long j = b6a.A00;
        return (int) (j ^ (j >>> 32));
    }

    public static long A0B(float f, float f2) {
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static long A0D(Object obj) {
        return AbstractC1414Aij.A04(((SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine) obj).A04).A0E.AHG();
    }

    public static C1003AOr A0E() {
        return new C1003AOr(null, 1.0f, 1500.0f);
    }

    public static BRg A0G(C0z7 c0z7, BRg bRg) {
        return c0z7.A4C(C2VU.A06, bRg).then(C10G.A02);
    }

    public static BRg A0I(BRg bRg) {
        return C10G.A0A(bRg.then(C10G.A02), 56.0f, Float.NaN);
    }

    public static InterfaceC1380AiA A0J(BFM bfm) {
        return C06I.A00(AcQ.A06, bfm, C2VU.A00, 48);
    }

    public static HatchScreen A0M(BFM bfm) {
        return HatchInteractionEnumsKt.chatScreen(((Boolean) bfm.A6v(LocalIsPrimaryThreadKt.LocalIsPrimaryThread)).booleanValue());
    }

    public static HatchIdentityProvider A0N(BFM bfm) {
        return HatchIdentityProvider.Companion.getInstance((AbstractC3358CGz) bfm.A6v(LocalUserSessionKt.LocalUserSession));
    }

    public static AuraHeadlineAndBodyColors A0O(BFM bfm) {
        return AuraHeadlineAndBodyDefaults.INSTANCE.m3095colorsdgg9oW8(0L, 0L, bfm, 384, 3);
    }

    public static BzK A0P() {
        return ((C4oT) HatchDeveloperPrefs.prefs$delegate.getValue()).A9q();
    }

    public static IllegalArgumentException A0Q(Object obj, String str, int i) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(") is out of the years range of ");
        sb.append(obj);
        sb.append('.');
        return new IllegalArgumentException(sb.toString());
    }

    public static Object A0S(AOP aop, BFM bfm, Snapshot snapshot, Snapshot snapshot2, G0U g0u) {
        Object objA09 = aop.A02.A09();
        Snapshot.A07(snapshot, snapshot2, g0u);
        bfm.Ai0(objA09);
        return objA09;
    }

    public static Object A0V(BFM bfm, Object obj, Object obj2) {
        if (obj != obj2) {
            return obj;
        }
        C066978i c066978i = new C066978i(C78e.A00(bfm, C6ys.A00));
        bfm.Ai0(c066978i);
        return c066978i;
    }

    public static String A0X(int i) {
        return String.format(Locale.getDefault(), "%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i / 60), Integer.valueOf(i % 60)}, 2));
    }

    public static String A0a(String str, Object obj) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(obj);
        return sb.toString();
    }

    public static Map A0d(Object obj, Object obj2, HxE hxE) {
        return AGH.A0D(hxE, new HxE(obj, obj2));
    }

    public static Set A0f() {
        return BFI.A0H(new Integer[]{new Integer(200), new Integer(201), new Integer(400), new Integer(403), new Integer(404), new Integer(409), new Integer(410), new Integer(429)});
    }

    public static C0924AIa A0i(Object obj) {
        C0924AIa c0924AIa = new C0924AIa();
        if (obj != null) {
            c0924AIa.put(HatchMetadataKey.SPACE_ID.getValue(), obj);
        }
        return c0924AIa;
    }

    public static void A0n(View view, AuraToast.Companion companion, String str) {
        AuraToast auraToastM3114makeKDArT4I = companion.m3114makeKDArT4I(view, str, null, AuraToast.Duration.SHORT, null, AuraToastOption.None.INSTANCE, null, false, null, AuraThemeMode.DEFAULT, null, null, false, false, null, null, null, AuraIconSize.MEDIUM, null);
        if (auraToastM3114makeKDArT4I != null) {
            auraToastM3114makeKDArT4I.show();
        }
    }

    public static void A0w(BFM bfm, AVy aVy, AuraButtonDefaults auraButtonDefaults, IconContext iconContext, int i) {
        auraButtonDefaults.m2407LeadingIconxqIIw2o(iconContext, aVy, null, null, bfm, (i & 14) | RuntimeInternals.IOPRIO_BACKGROUND | (AVy.$stable << 3), 12);
    }

    public static void A0x(BFM bfm, AVy aVy, AuraIconSize auraIconSize) {
        AuraIconKt.m2567AuraIconFHprtrg(null, aVy, auraIconSize, null, 0L, null, bfm, (AVy.$stable << 3) | 3456, 49);
    }

    public static void A0y(BFM bfm, AVy aVy, AuraIconSize auraIconSize, long j) {
        AuraIconKt.m2567AuraIconFHprtrg(null, aVy, auraIconSize, null, j, null, bfm, (AVy.$stable << 3) | 384, 41);
    }

    public static void A0z(BFM bfm, AVy aVy, AuraIconSize auraIconSize, long j) {
        AuraIconKt.m2567AuraIconFHprtrg(null, aVy, auraIconSize, null, j, null, bfm, (AVy.$stable << 3) | 3456, 33);
    }

    public static void A12(BFM bfm, AuraTextInputDefaults auraTextInputDefaults, String str) {
        auraTextInputDefaults.m2587PlaceholderTextqdpcsU(str, 0, null, bfm, 3072, 6);
    }

    public static void A15(AYU ayu, AZE aze, int i) {
        if (aze != null) {
            AYU.A04(ayu, aze, 0, C2VU.A04.A4A(aze.A00, i));
        }
    }

    public static void A16(AYU ayu, AZE aze, int i, int i2) {
        if (aze != null) {
            AYU.A04(ayu, aze, i - aze.A01, C2VU.A04.A4A(aze.A00, i2));
        }
    }

    public static void A17(DevicePermissionManageControllerKt$rememberDevicePermissionLauncher$2$1 devicePermissionManageControllerKt$rememberDevicePermissionLauncher$2$1) {
        HatchPermissionUtils.INSTANCE.openAppSettings(devicePermissionManageControllerKt$rememberDevicePermissionLauncher$2$1.$context);
        devicePermissionManageControllerKt$rememberDevicePermissionLauncher$2$1.$onPermissionFlowFinished.invoke();
    }

    public static void A1B(G0U g0u, float f, float f2) {
        g0u.invoke(Float.valueOf(ATD.A03(f / f2, 0.0f, 1.0f)));
    }

    public static void A1D(boolean z, BFM bfm, int i) {
        if (bfm.AfS(i & 1, z)) {
            return;
        }
        bfm.Afo();
    }

    public static void A1E(boolean z, BFM bfm, int i) {
        if (bfm.AfS(i & 1, z)) {
            AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(null, AuraSpinnerStyle.Companion.small(bfm, 6), 0L, bfm, AuraSpinnerStyle.$stable << 3, 5);
        } else {
            bfm.Afo();
        }
    }

    public static void A1F(boolean z, BFM bfm, int i) {
        if (bfm.AfS(i & 1, z)) {
            AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(null, null, 0L, bfm, 0, 7);
        } else {
            bfm.Afo();
        }
    }

    public static boolean A1G(int i) {
        return (234881024 & i) == 67108864;
    }

    public static boolean A1H(int i) {
        return (458752 & i) == 131072;
    }

    public static boolean A1I(int i) {
        return (i & 458752) == 131072;
    }

    public static boolean A1L(BFM bfm, AuraInviteFriendSheetKt.AnonymousClass5 anonymousClass5) {
        return bfm.A67(anonymousClass5.$shareViewModel) | bfm.A67(anonymousClass5.$context);
    }

    public static float A00(int i, int i2, int i3, int i4, int i5) {
        return (((Math.max(i, i2) + Math.min(i3, i4)) / 2) - i2) / i5;
    }

    public static int A04(int i, int i2) {
        return (32768 & i) != 0 ? i2 & (-458753) : i2;
    }

    public static int A05(int i, int i2, int i3, int i4, int i5) {
        return i4 + Math.max(i3, Math.max(i, i2)) + i5;
    }

    public static int A06(BFM bfm, int i) {
        return bfm.A63(i) ? 2048 : 1024;
    }

    public static int A08(Object obj, G0V g0v, int i) {
        return ((Number) g0v.invoke(obj, Integer.valueOf(i))).intValue();
    }

    public static long A0A(float f, float f2) {
        return (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
    }

    public static InterfaceC1380AiA A0K(BFM bfm, float f) {
        return C0A8.A00(AcQ.A00(f), bfm, C2VU.A04, 48);
    }

    public static InterfaceC1380AiA A0L(BFM bfm, float f) {
        return C0A8.A00(AcQ.A00(f), bfm, C2VU.A04, 54);
    }

    public static Long A0R(HatchConnectorCatalogRepository hatchConnectorCatalogRepository, HzP hzP) {
        HzS.A05(hzP.getContext());
        return hatchConnectorCatalogRepository.cache.getGeneration();
    }

    public static Object A0T(BFM bfm, Object obj) {
        Object objAaT = bfm.AaT();
        if (objAaT != obj) {
            return objAaT;
        }
        ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = new ParcelableSnapshotMutableFloatState(0.0f);
        bfm.Ai0(parcelableSnapshotMutableFloatState);
        return parcelableSnapshotMutableFloatState;
    }

    public static Object A0U(BFM bfm, Object obj) {
        Object objAaT = bfm.AaT();
        if (objAaT != obj) {
            return objAaT;
        }
        C1qN c1qN = new C1qN();
        bfm.Ai0(c1qN);
        return c1qN;
    }

    public static String A0Y(int i, BFM bfm, int i2) {
        return AbstractC2271BQs.A00(i2, new Object[]{Integer.valueOf(i)}, bfm, i);
    }

    public static String A0Z(Object obj, StringBuilder sb) {
        sb.append(obj);
        sb.append(')');
        return sb.toString();
    }

    public static Map A0c(HatchMetadataKey hatchMetadataKey, Object obj) {
        return AIW.A0J(new HxE(hatchMetadataKey.getValue(), obj));
    }

    public static Map A0e(Object obj, HxE hxE, HxE hxE2, boolean z) {
        return AGH.A0D(hxE, hxE2, new HxE(obj, String.valueOf(z)));
    }

    public static HxE A0g(float f, long j) {
        return new HxE(Float.valueOf(f), new B6A(j));
    }

    public static HxE A0h(Object obj, float f, long j) {
        return new HxE(obj, new B6A(HxS.A04(HDi.A0O[(int) (j & 63)], B6A.A03(j), B6A.A02(j), B6A.A01(j), f)));
    }

    public static void A19(AbstractCollection abstractCollection, Iterator it) {
        Object next = it.next();
        if (((String) next).length() > 0) {
            abstractCollection.add(next);
        }
    }

    public static void A1A(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(((AuraTabItem) it.next()).getId());
    }

    public static boolean A1J(int i) {
        return (599187 & i) != 599186;
    }

    public static boolean A1K(BFM bfm, int i) {
        return C7384Etj.areEqual(bfm.AaT(), Integer.valueOf(i));
    }

    public static boolean A1M(BFM bfm, HatchIdeasTabScreenKt$ideaListSection$1$1 hatchIdeasTabScreenKt$ideaListSection$1$1, Object obj) {
        return bfm.A65(obj) | bfm.A67(hatchIdeasTabScreenKt$ideaListSection$1$1.$card) | bfm.A63(hatchIdeasTabScreenKt$ideaListSection$1$1.$index);
    }

    public static boolean A1N(Object obj, BLG blg) {
        Object value = blg.getValue();
        return blg.A6e(value, BGK.A04(obj, (Set) value));
    }

    public static boolean A1O(Object obj, BLG blg) {
        Object value = blg.getValue();
        return blg.A6e(value, BGK.A02(obj, (Set) value));
    }

    public static boolean A1P(String str, Iterator it) {
        return str.equals(((HatchConversationListItem) it.next()).getKey());
    }
}
