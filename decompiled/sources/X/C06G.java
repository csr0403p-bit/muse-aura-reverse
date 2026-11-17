package X;

import com.facebook.aura.R;
import com.facebook.aura.bugreport.AuraBugReportReviewUiState;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmValuePropLink;
import com.facebook.aura.conversation.view.InlineContentCallbacks;
import com.facebook.aura.email.viewmodel.EmailState;
import com.facebook.aura.explore.model.HatchExploreViewModel;
import com.facebook.aura.explore.repo.ExploreLoadingState;
import com.facebook.aura.header.view.HatchBackClickAnalytics;
import com.facebook.aura.linktext.HatchTextLink;
import com.facebook.aura.login.nativeflow.NativeLoginCommonKt;
import com.facebook.aura.model.HatchWidget;
import com.facebook.aura.settings.HatchCredentialsViewModel;
import com.facebook.aura.settings.HatchMessengerUiState;
import com.facebook.aura.settings.HatchTelegramUiState;
import com.facebook.aura.settings.TelegramConnectPhase;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.sharesheet.HatchShareSheetUiState;
import com.facebook.aura.skills.model.Skill;
import com.facebook.aura.spaces.menu.SpaceContextMenuKt$SpaceContextMenu$2;
import com.facebook.aura.toast.api.ToastApi;
import com.facebook.aura.ui.adaptive.AuraAdaptiveInfo;
import com.facebook.aura.ui.adaptive.AuraAdaptiveInfoKt;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerKt;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerStyle;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraAdaptiveColorsKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import com.facebook.aura.vds.compose.theme.AuraColorsTextInput;
import com.facebook.aura.vds.compose.theme.AuraDimensions;
import com.facebook.aura.vds.compose.theme.AuraDimensionsIcon;
import com.facebook.aura.vds.compose.theme.AuraDimensionsKt;
import com.facebook.aura.vds.compose.theme.AuraShapes;
import com.facebook.aura.vds.compose.theme.AuraShapesKt;
import com.facebook.aura.vds.compose.theme.AuraTypography;
import com.facebook.aura.vds.compose.theme.AuraTypographyKt;
import com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode;
import com.facebook.aura.vds.compose.toast.AuraToastOption;
import com.facebook.aura.vds.toast.AuraToast;
import java.util.AbstractCollection;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* renamed from: X.06G, reason: invalid class name */
/* loaded from: classes.dex */
public class C06G {
    public static int A04(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public static void A0f(BFM bfm, int i) {
        AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, i), null, ((AuraColors) bfm.A6v(AuraColorsKt.LocalAuraColors)).secondaryText, ((AuraTypography) bfm.A6v(AuraTypographyKt.LocalAuraTypography)).bodyRegular, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
    }

    public static void A0g(BFM bfm, BBI bbi, AuraSpinnerStyle.Companion companion) {
        AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(null, companion.large(bfm, 6), 0L, bfm, AuraSpinnerStyle.$stable << 3, 5);
        BBI.A0R(bbi, true);
    }

    public static void A0h(BFM bfm, SpaceContextMenuKt$SpaceContextMenu$2 spaceContextMenuKt$SpaceContextMenu$2, AbstractCollection abstractCollection) {
        abstractCollection.add(new AuraContextMenuItem(8, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120559), null, AbstractC8407FdO.A00(bfm, R.drawable.pencil_outline_24_wght400), new B6A(spaceContextMenuKt$SpaceContextMenu$2.$colors.primaryText), null, false, false, false, true, false, BRg.A00, 1, 1));
    }

    public static void A0i(AuraToast.Duration duration, String str) {
        ToastApi._toasts.AhV(new AuraToast.ToastArgs(str, null, duration, null, AuraToastOption.None.INSTANCE, null, false, null, AuraThemeMode.DEFAULT, null, null, false, false, null, null, null, AuraIconSize.MEDIUM, null));
    }

    public static void A0n(Function0 function0, BFM bfm, int i) {
        NativeLoginCommonKt.m1283NativeLoginTextLinkfWhpE4E(AbstractC2271BQs.A01(bfm, i), function0, null, 0L, ((AuraTypography) bfm.A6v(AuraTypographyKt.LocalAuraTypography)).bodyMedium, false, bfm, 0, 44);
    }

    public static boolean A0o(int i, int i2, boolean z) {
        if ((i & i2) != 0) {
            return false;
        }
        return z;
    }

    public static boolean A0q(EmailState emailState, Object obj, BLG blg, int i) {
        return blg.A6e(obj, EmailState.copy$default(emailState, false, false, false, null, null, null, false, null, false, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, false, false, null, null, null, false, false, null, null, null, null, null, null, null, false, null, false, null, null, false, false, false, null, null, null, false, null, false, null, null, -1, i, null));
    }

    public static boolean A0r(HatchExploreViewModel.IdeasUiState ideasUiState, ExploreLoadingState exploreLoadingState, Object obj, BLG blg) {
        return blg.A6e(obj, ideasUiState.copy(exploreLoadingState, ideasUiState.sections, ideasUiState.executionStatuses, ideasUiState.hasBuiltIdea, ideasUiState.hasMore, ideasUiState.imageRetryNonce));
    }

    public static boolean A0t(HatchMessengerUiState hatchMessengerUiState, Object obj, BLG blg, int i) {
        return blg.A6e(obj, HatchMessengerUiState.copy$default(hatchMessengerUiState, false, false, null, null, false, null, false, false, null, null, i, null));
    }

    public static float A00(BFM bfm) {
        return ((AuraDimensions) bfm.A6v(AuraDimensionsKt.LocalAuraDimensions)).gutterWidth;
    }

    public static int A02() {
        return (HatchBackClickAnalytics.$stable << 21) | 805306368;
    }

    public static long A05(long j, long j2, int i) {
        return i != 0 ? HxS.A04(HDi.A0O[(int) (j & 63)], B6A.A03(j), B6A.A02(j), B6A.A01(j), 0.3f) : j2;
    }

    public static long A06(BFM bfm) {
        return ((AuraColors) bfm.A6v(AuraColorsKt.LocalAuraColors)).secondaryIcon.enabled;
    }

    public static long A07(BFM bfm) {
        return ((AuraColors) bfm.A6v(AuraColorsKt.LocalAuraColors)).link;
    }

    public static long A08(BFM bfm) {
        return ((AuraColors) bfm.A6v(AuraColorsKt.LocalAuraColors)).secondaryText;
    }

    public static long A09(BFM bfm) {
        return ((AuraColors) bfm.A6v(AuraColorsKt.LocalAuraColors)).tertiaryText;
    }

    public static long A0A(BFM bfm) {
        return ((AuraColors) bfm.A6v(AuraColorsKt.LocalAuraColors)).primaryIcon.enabled;
    }

    public static long A0B(BFM bfm) {
        return ((AuraColors) bfm.A6v(AuraColorsKt.LocalAuraColors)).background;
    }

    public static long A0C(BFM bfm) {
        return ((AuraColors) bfm.A6v(AuraColorsKt.LocalAuraColors)).primaryText;
    }

    public static long A0D(BFM bfm) {
        return ((AuraColors) bfm.A6v(AuraColorsKt.LocalAuraColors)).accent;
    }

    public static BRg A0M(BFM bfm, BRg bRg) {
        return C3U4.A0B(bRg, ((AuraDimensions) bfm.A6v(AuraDimensionsKt.LocalAuraDimensions)).gutterWidth, 0.0f);
    }

    public static BRg A0N(BFM bfm, BRg bRg) {
        return C1b8.A03(bRg, C1OM.A00, ((AuraColors) bfm.A6v(AuraColorsKt.LocalAuraColors)).background);
    }

    public static BRg A0O(BFM bfm, BRg bRg) {
        AKH<AuraDimensions> akh = AuraDimensionsKt.LocalAuraDimensions;
        return C3U4.A0C(bRg, ((AuraDimensions) bfm.A6v(akh)).gutterWidth, 0.0f, ((AuraDimensions) bfm.A6v(akh)).gutterWidth, ((AuraDimensions) bfm.A6v(akh)).gutterWidth);
    }

    public static B6A A0Q(SpaceContextMenuKt$SpaceContextMenu$2 spaceContextMenuKt$SpaceContextMenu$2) {
        return new B6A(spaceContextMenuKt$SpaceContextMenu$2.$colors.primaryText);
    }

    public static C1DM A0R(BFM bfm) {
        return ((AuraShapes) bfm.A6v(AuraShapesKt.LocalAuraShapes)).card;
    }

    public static C1822Arm A0S(BFM bfm) {
        return ((AuraTypography) bfm.A6v(AuraTypographyKt.LocalAuraTypography)).caption1Regular;
    }

    public static C1822Arm A0T(BFM bfm) {
        return ((AuraTypography) bfm.A6v(AuraTypographyKt.LocalAuraTypography)).bodyRegular;
    }

    public static C1822Arm A0U(BFM bfm) {
        return ((AuraTypography) bfm.A6v(AuraTypographyKt.LocalAuraTypography)).title2Emphasized;
    }

    public static C1822Arm A0V(BFM bfm) {
        return ((AuraTypography) bfm.A6v(AuraTypographyKt.LocalAuraTypography)).subheadlineMedium;
    }

    public static C1822Arm A0W(BFM bfm) {
        return ((AuraTypography) bfm.A6v(AuraTypographyKt.LocalAuraTypography)).bodyMedium;
    }

    public static C1822Arm A0X(BFM bfm) {
        return ((AuraTypography) bfm.A6v(AuraTypographyKt.LocalAuraTypography)).bodyEmphasized;
    }

    public static C1822Arm A0Y(BFM bfm) {
        return ((AuraTypography) bfm.A6v(AuraTypographyKt.LocalAuraTypography)).footnoteRegular;
    }

    public static C1822Arm A0Z(BFM bfm) {
        return ((AuraTypography) bfm.A6v(AuraTypographyKt.LocalAuraTypography)).subheadlineRegular;
    }

    public static AuraColorsTextInput A0b(BFM bfm) {
        return AuraColorsKt.m2821withBackgroundColor4WTKRHQ(((AuraColors) bfm.A6v(AuraColorsKt.LocalAuraColors)).textInput, B6A.A06);
    }

    public static C9hv A0e(F0C[] f0cArr, int i) {
        return (C9hv) f0cArr[i].getValue();
    }

    public static void A0j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        C7384Etj.A0Y(obj, 24);
        C7384Etj.A0Y(obj2, 25);
        C7384Etj.A0Y(obj3, 26);
        C7384Etj.A0Y(obj4, 27);
        C7384Etj.A0Y(obj5, 28);
    }

    public static void A0k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        C7384Etj.A0Y(obj, 29);
        C7384Etj.A0Y(obj2, 30);
        C7384Etj.A0Y(obj3, 31);
        C7384Etj.A0Y(obj4, 32);
        C7384Etj.A0Y(obj5, 33);
    }

    public static boolean A0p(BFM bfm) {
        return ((AuraAdaptiveInfo) bfm.A6v(AuraAdaptiveInfoKt.LocalAuraAdaptiveInfo)).isCompact();
    }

    public static boolean A0s(HatchCredentialsViewModel hatchCredentialsViewModel, Object obj) {
        return C7384Etj.areEqual(hatchCredentialsViewModel._credentialDetailsState.getValue().credentialId, obj);
    }

    public static boolean A0u(HatchTelegramUiState hatchTelegramUiState, TelegramConnectPhase telegramConnectPhase, Object obj, BLG blg) {
        return blg.A6e(obj, new HatchTelegramUiState(hatchTelegramUiState.isLinked, hatchTelegramUiState.isLoading, telegramConnectPhase, hatchTelegramUiState.showOnboarding, hatchTelegramUiState.showDisconnectDialog, hatchTelegramUiState.botUsername));
    }

    public static boolean A0w(BLG blg) {
        Object value = blg.getValue();
        return blg.A6e(value, HatchShareSheetUiState.copy$default((HatchShareSheetUiState) value, null, null, null, null, false, false, null, null, false, null, false, 2039, null));
    }

    public static float A01(BFM bfm, AKN akn) {
        return ((AuraDimensions) bfm.A6v(akn)).gutterWidth;
    }

    public static int A03(int i, int i2) {
        int i3 = i2 << 3;
        return HatchWidget.$stable | (i & 14) | ((i2 >> 9) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | (i3 & 896) | (i3 & 7168) | (InlineContentCallbacks.$stable << 12) | ((i2 >> 3) & 57344) | ((i << 6) & 458752);
    }

    public static long A0E(BFM bfm, AKN akn) {
        return ((AuraColors) bfm.A6v(akn)).border;
    }

    public static long A0F(BFM bfm, AKN akn) {
        return ((AuraColors) bfm.A6v(akn)).shadow;
    }

    public static long A0G(BFM bfm, AKN akn) {
        return ((AuraColors) bfm.A6v(akn)).primaryIcon.enabled;
    }

    public static long A0H(BFM bfm, AKN akn) {
        return ((AuraColors) bfm.A6v(akn)).secondaryIcon.enabled;
    }

    public static long A0I(BFM bfm, AKN akn) {
        return ((AuraColors) bfm.A6v(akn)).secondaryText;
    }

    public static long A0J(BFM bfm, AKN akn) {
        return AuraAdaptiveColorsKt.adaptiveFill((AuraColors) bfm.A6v(akn), bfm, AuraColors.$stable);
    }

    public static long A0K(BFM bfm, AKN akn) {
        return ((AuraColors) bfm.A6v(akn)).background;
    }

    public static long A0L(BFM bfm, AKN akn) {
        return ((AuraColors) bfm.A6v(akn)).primaryText;
    }

    public static BRg A0P(BFM bfm, BRg bRg, C1DM c1dm) {
        return C1b8.A03(C11U.A03(bRg, c1dm), C1OM.A00, ((AuraColors) bfm.A6v(AuraColorsKt.LocalAuraColors)).highlight);
    }

    public static C1822Arm A0a(BFM bfm, AKN akn) {
        return ((AuraTypography) bfm.A6v(akn)).footnoteRegular;
    }

    public static AuraDimensionsIcon A0c(BFM bfm, int i) {
        bfm.AgE(i);
        return ((AuraDimensions) bfm.A6v(AuraDimensionsKt.LocalAuraDimensions)).icon;
    }

    public static AuraDimensionsIcon A0d(BFM bfm, AKN akn) {
        return ((AuraDimensions) bfm.A6v(akn)).icon;
    }

    public static void A0l(AbstractCollection abstractCollection, Iterator it) {
        ConfidentialVmValuePropLink confidentialVmValuePropLink = (ConfidentialVmValuePropLink) it.next();
        abstractCollection.add(new HatchTextLink(confidentialVmValuePropLink.offset, confidentialVmValuePropLink.length, confidentialVmValuePropLink.url));
    }

    public static void A0m(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(((Skill) it.next()).id);
    }

    public static boolean A0v(BLG blg) {
        Object value = blg.getValue();
        return blg.A6e(value, AuraBugReportReviewUiState.copy$default((AuraBugReportReviewUiState) value, false, false, false, null, null, false, null, null, null, 255, null));
    }

    public static F0C[] A0x(Integer num, Function0 function0) {
        return new F0C[]{AbstractC5321DgF.A02(num, function0)};
    }
}
