package com.facebook.aura.spaces.menu;

import X.AHD;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AbstractC8407FdO;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.BRg;
import X.C1BO;
import X.G0V;
import com.facebook.aura.R;
import com.facebook.aura.model.SpaceConstructionStatus;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import com.facebook.aura.vds.compose.theme.AuraColors;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class SpaceContextMenuKt$SpaceContextMenu$2 extends AbstractC7559F3s implements G0V<BFM, Integer, AHD<? extends AuraContextMenuItem>> {
    public final /* synthetic */ C1BO<Boolean> $addShortcutSupported$delegate;
    public final /* synthetic */ C1BO<Boolean> $addWidgetSupported$delegate;
    public final /* synthetic */ boolean $asBottomSheet;
    public final /* synthetic */ boolean $canDelete;
    public final /* synthetic */ boolean $canDownloadHtml;
    public final /* synthetic */ boolean $canShare;
    public final /* synthetic */ AuraColors $colors;
    public final /* synthetic */ SpaceConstructionStatus $constructionStatus;
    public final /* synthetic */ boolean $hidesSharingWithPeople;
    public final /* synthetic */ SpaceInviteMenuAction $inviteAction;
    public final /* synthetic */ boolean $isOwnedSpace;
    public final /* synthetic */ boolean $isPinned;
    public final /* synthetic */ boolean $isSavedSpace;
    public final /* synthetic */ SpaceContextMenuMode $mode;
    public final /* synthetic */ boolean $multiplayer;
    public final /* synthetic */ Function0<Unit> $onChangeIcon;
    public final /* synthetic */ Function0<Unit> $onMoveToLibrary;
    public final /* synthetic */ Function0<Unit> $onMoveToSpaces;
    public final /* synthetic */ Function0<Unit> $onRename;
    public final /* synthetic */ Function0<Unit> $onTogglePin;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SpaceContextMenuMode.values().length];
            try {
                AnonymousClass002.A13(SpaceContextMenuMode.SIDEBAR, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(SpaceContextMenuMode.LIBRARY, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(SpaceContextMenuMode.DEFAULT, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpaceContextMenuKt$SpaceContextMenu$2(Function0<Unit> function0, Function0<Unit> function02, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, SpaceInviteMenuAction spaceInviteMenuAction, AuraColors auraColors, SpaceContextMenuMode spaceContextMenuMode, boolean z6, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05, boolean z7, boolean z8, SpaceConstructionStatus spaceConstructionStatus, boolean z9, C1BO<Boolean> c1bo, C1BO<Boolean> c1bo2) {
        super(2);
        this.$onMoveToLibrary = function0;
        this.$onMoveToSpaces = function02;
        this.$isOwnedSpace = z;
        this.$canShare = z2;
        this.$hidesSharingWithPeople = z3;
        this.$multiplayer = z4;
        this.$asBottomSheet = z5;
        this.$inviteAction = spaceInviteMenuAction;
        this.$colors = auraColors;
        this.$mode = spaceContextMenuMode;
        this.$isSavedSpace = z6;
        this.$onRename = function03;
        this.$onChangeIcon = function04;
        this.$onTogglePin = function05;
        this.$isPinned = z7;
        this.$canDownloadHtml = z8;
        this.$constructionStatus = spaceConstructionStatus;
        this.$canDelete = z9;
        this.$addShortcutSupported$delegate = c1bo;
        this.$addWidgetSupported$delegate = c1bo2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ AHD<? extends AuraContextMenuItem> invoke(BFM bfm, Integer num) {
        return invoke(bfm, AnonymousClass001.A0F(num));
    }

    public static final void invoke$addDelete(boolean z, List<AuraContextMenuItem> list, BFM bfm, int i) {
        bfm.AgE(1087775710);
        if (z) {
            if (!list.isEmpty()) {
                list.add(new AuraContextMenuItem(9, "", null, null, null, null, false, true, false, true, false, BRg.A00, 1, 1));
            }
            list.add(new AuraContextMenuItem(2, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12054f), null, AbstractC8407FdO.A00(bfm, R.drawable.trash_wght400_outline_24), null, null, false, false, false, true, true, BRg.A00, 1, 1));
        }
        AnonymousClass002.A19(bfm);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
    /* JADX WARN: Type inference failed for: r13v1, types: [X.AVy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AHD<com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem> invoke(X.BFM r24, int r25) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 1301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spaces.menu.SpaceContextMenuKt$SpaceContextMenu$2.invoke(X.BFM, int):X.AHD");
    }
}
