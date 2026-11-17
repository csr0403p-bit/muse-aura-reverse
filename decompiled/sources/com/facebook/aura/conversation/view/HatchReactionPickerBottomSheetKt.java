package com.facebook.aura.conversation.view;

import X.AGH;
import X.AHD;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.B1V;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C07C;
import X.C78N;
import X.G0U;
import X.G0V;
import X.G0W;
import X.HxE;
import androidx.compose.runtime.snapshots.Snapshot;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionEnumsKt;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.conversation.reactions.HatchReactionOrderingKt;
import com.facebook.aura.conversation.reactions.HatchReactionUsageStore;
import com.facebook.aura.conversation.view.richcontent.CurrentChatThreadLogMetadataKt;
import com.facebook.aura.vds.compose.bottomsheet.AuraInlineBottomSheetKt;
import com.facebook.aura.vds.compose.bottomsheet.state.RememberAuraBottomSheetStateKt;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchReactionPickerBottomSheetKt {

    /* renamed from: com.facebook.aura.conversation.view.HatchReactionPickerBottomSheetKt$EmojiPickerContent$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AHD<String> $frequentlyUsed;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<String, Unit> $onEmojiSelected;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(AHD<String> ahd, G0U<? super String, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$frequentlyUsed = ahd;
            this.$onEmojiSelected = g0u;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchReactionPickerBottomSheetKt.EmojiPickerContent(this.$frequentlyUsed, this.$onEmojiSelected, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchReactionPickerBottomSheetKt$HatchReactionPickerBottomSheet$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ AHD<String> $frequentlyUsed;
        public final /* synthetic */ String $messageRole;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ G0U<String, Unit> $onReaction;
        public final /* synthetic */ Map<String, String> $threadLogMetadata;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(AHD<String> ahd, String str, Map<String, String> map, G0U<? super String, Unit> g0u, Function0<Unit> function0, BRg bRg) {
            super(3);
            this.$frequentlyUsed = ahd;
            this.$messageRole = str;
            this.$threadLogMetadata = map;
            this.$onReaction = g0u;
            this.$onDismiss = function0;
            this.$modifier = bRg;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                AHD<String> ahd = this.$frequentlyUsed;
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$onDismiss, AnonymousClass001.A1R(bfm, this.$onReaction, AnonymousClass001.A1T(bfm, this.$threadLogMetadata, bfm.A65(this.$messageRole))));
                String str = this.$messageRole;
                Map<String, String> map = this.$threadLogMetadata;
                G0U<String, Unit> g0u = this.$onReaction;
                Function0<Unit> function0 = this.$onDismiss;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new HatchReactionPickerBottomSheetKt$HatchReactionPickerBottomSheet$1$1$1(str, map, g0u, function0);
                    bfm.Ai0(objAaT);
                }
                HatchReactionPickerBottomSheetKt.EmojiPickerContent(ahd, (G0U) objAaT, this.$modifier, bfm, 0, 0);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchReactionPickerBottomSheetKt$HatchReactionPickerBottomSheet$2, reason: invalid class name and case insensitive filesystem */
    public final class C115102 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $messageRole;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ G0U<String, Unit> $onReaction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C115102(String str, G0U<? super String, Unit> g0u, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$messageRole = str;
            this.$onReaction = g0u;
            this.$onDismiss = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchReactionPickerBottomSheetKt.HatchReactionPickerBottomSheet(this.$messageRole, this.$onReaction, this.$onDismiss, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x026c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void EmojiPickerContent(X.AHD<java.lang.String> r86, X.G0U<? super java.lang.String, kotlin.Unit> r87, X.BRg r88, X.BFM r89, int r90, int r91) {
        /*
            Method dump skipped, instructions count: 1349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchReactionPickerBottomSheetKt.EmojiPickerContent(X.AHD, X.G0U, X.BRg, X.BFM, int, int):void");
    }

    public static final void HatchReactionPickerBottomSheet(String str, G0U<? super String, Unit> g0u, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean zA1Z = AnonymousClass005.A1Z(str, g0u, function0);
        bfm.AgG(1738365335);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, g0u);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function0);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            Map<String, String> mapCurrentChatThreadLogMetadata = CurrentChatThreadLogMetadataKt.currentChatThreadLogMetadata(bfm, 0);
            boolean zA65 = bfm.A65(abstractC3358CGzA0h);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                Snapshot snapshotA03 = Snapshot.A03();
                G0U<Object, Unit> g0uA0D = snapshotA03 != null ? snapshotA03.A0D() : null;
                Snapshot snapshotA04 = Snapshot.A04(snapshotA03);
                try {
                    Map<String, Integer> value = HatchReactionUsageStore.Companion.getInstance(abstractC3358CGzA0h).counts.getValue();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Iterator itA0n = AnonymousClass002.A0n(value);
                    while (itA0n.hasNext()) {
                        Map.Entry entry = (Map.Entry) itA0n.next();
                        if (HatchCustomReactionKt.isRenderableReactionToken((String) entry.getKey())) {
                            AnonymousClass006.A1R(linkedHashMap, entry);
                        }
                    }
                    Snapshot.A07(snapshotA03, snapshotA04, g0uA0D);
                    objAaT = HatchReactionOrderingKt.orderedReactionEmojis(linkedHashMap, HatchReactionDataKt.FREQUENTLY_USED_EMOJIS, 16, 0);
                    bfm.Ai0(objAaT);
                } catch (Throwable th) {
                    Snapshot.A07(snapshotA03, snapshotA04, g0uA0D);
                    throw th;
                }
            }
            AuraInlineBottomSheetKt.AuraInlineBottomSheet(AuraContainer.SecondaryBottomSheet.INSTANCE, null, function0, RememberAuraBottomSheetStateKt.rememberAuraBottomSheetState(false, null, false, bfm, 6, 6), null, null, null, null, null, null, false, false, zA1Z, B1V.A00(bfm, new AnonymousClass1((AHD) objAaT, str, mapCurrentChatThreadLogMetadata, g0u, function0, bRg2), -2132831116), bfm, (iA0d & 896) | 24582, 3456, 4066);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C115102(str, g0u, function0, bRg2, i, i2);
        }
    }

    public static final List<String> categoryEmojis(EmojiCategory emojiCategory, boolean z) {
        if (!z || !HatchReactionDataKt.SMILEYS_CATEGORY_ID.equals(emojiCategory.id)) {
            return emojiCategory.emojis;
        }
        int iIndexOf = emojiCategory.emojis.indexOf("\u1f60d");
        if (iIndexOf < 0) {
            iIndexOf = emojiCategory.emojis.size();
        }
        List<String> list = emojiCategory.emojis;
        return HatchCustomReactionKt.withCustomReactionsAt(list, iIndexOf, list.size() + HatchCustomReaction.userOffered.size());
    }

    public static final void handleReactionSelected(String str, String str2, Map<String, String> map, G0U<? super String, Unit> g0u, Function0<Unit> function0) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, HatchSubsurface.MESSAGE_LIST, HatchScreen.MAIN_CHAT, HatchComponent.REACTION_BUTTON, null, AGH.A02(map, AnonymousClass007.A0d("emoji", HatchCustomReactionKt.reactionAnalyticsValue(str), new HxE("message_role", AnonymousClass001.A0u(str2)))), null);
        g0u.invoke(str);
        function0.invoke();
    }

    public static final void logCategoryTabClick(boolean z, Map<String, String> map) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, HatchSubsurface.MESSAGE_LIST, HatchInteractionEnumsKt.chatScreen(z), HatchComponent.REACTION_PICKER_CATEGORY_TAB, null, map, null);
    }
}
