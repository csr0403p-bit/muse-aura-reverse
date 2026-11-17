package com.facebook.aura.conversation.view.richcontent;

import X.AGH;
import X.AGI;
import X.AHD;
import X.AII;
import X.AIM;
import X.AIW;
import X.AKQ;
import X.AVy;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C0924AIa;
import X.C1515AkP;
import X.C2VU;
import X.C3U4;
import X.C3Ue;
import X.C3cG;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import android.net.Uri;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Alignment;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionEnumsKt;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import com.facebook.aura.file.utils.HatchFileUIUtils;
import com.facebook.aura.model.HatchWidgetPresentationKt;
import com.facebook.aura.settings.HatchDataExportLoggingKt;
import com.facebook.aura.utils.ArtifactShareOption;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuKt;
import com.facebook.aura.vds.compose.icons.AuraIconButtonBackground;
import com.facebook.aura.vds.compose.icons.AuraIconButtonKt;
import com.facebook.aura.vds.compose.icons.AuraIconButtonSizeV2;
import com.facebook.aura.vds.compose.icons.AuraIconButtonStyle;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class HatchInlineFileChipKt {
    public static final int MENU_DOWNLOAD = 4;
    public static final int MENU_DOWNLOAD_AS_HTML = 1;
    public static final int MENU_DOWNLOAD_AS_PDF = 3;
    public static final int MENU_SAVE_TO_GOOGLE_DRIVE = 2;
    public static final int MENU_SHARE = 0;
    public static final String MIME_TYPE_HTML = "text/html";
    public static final float PreviewCornerRadius = 12.0f;
    public static final float PreviewInset = 4.0f;

    /* renamed from: com.facebook.aura.conversation.view.richcontent.HatchInlineFileChipKt$ChipMenuButton$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $fileName;
        public final /* synthetic */ boolean $isSlides;
        public final /* synthetic */ HatchDocumentChipMenuActions $menuActions;
        public final /* synthetic */ String $mimeType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchDocumentChipMenuActions hatchDocumentChipMenuActions, String str, boolean z, String str2, int i) {
            super(2);
            this.$menuActions = hatchDocumentChipMenuActions;
            this.$fileName = str;
            this.$isSlides = z;
            this.$mimeType = str2;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchInlineFileChipKt.ChipMenuButton(this.$menuActions, this.$fileName, this.$isSlides, this.$mimeType, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.richcontent.HatchInlineFileChipKt$HatchInlineFileChip$2, reason: invalid class name and case insensitive filesystem */
    public final class C115172 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $addBottomPadding;
        public final /* synthetic */ boolean $addTopPadding;
        public final /* synthetic */ boolean $deleted;
        public final /* synthetic */ String $displayTitle;
        public final /* synthetic */ String $fileName;
        public final /* synthetic */ boolean $isSlides;
        public final /* synthetic */ boolean $loading;
        public final /* synthetic */ String $mimeType;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $preview;
        public final /* synthetic */ String $sender;
        public final /* synthetic */ String $url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C115172(String str, String str2, String str3, BRg bRg, String str4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str5, Function0<Unit> function0, G0V<? super BFM, ? super Integer, Unit> g0v, int i, int i2, int i3) {
            super(2);
            this.$fileName = str;
            this.$url = str2;
            this.$mimeType = str3;
            this.$modifier = bRg;
            this.$displayTitle = str4;
            this.$deleted = z;
            this.$loading = z2;
            this.$isSlides = z3;
            this.$addBottomPadding = z4;
            this.$addTopPadding = z5;
            this.$sender = str5;
            this.$onClick = function0;
            this.$preview = g0v;
            this.$$changed = i;
            this.$$changed1 = i2;
            this.$$default = i3;
        }

        public final void invoke(BFM bfm, int i) {
            HatchInlineFileChipKt.HatchInlineFileChip(this.$fileName, this.$url, this.$mimeType, this.$modifier, this.$displayTitle, this.$deleted, this.$loading, this.$isSlides, this.$addBottomPadding, this.$addTopPadding, this.$sender, this.$onClick, this.$preview, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.richcontent.HatchInlineFileChipKt$HatchInlineFileChip$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $addBottomPadding;
        public final /* synthetic */ boolean $addTopPadding;
        public final /* synthetic */ boolean $deleted;
        public final /* synthetic */ String $displayTitle;
        public final /* synthetic */ String $fileName;
        public final /* synthetic */ boolean $isSlides;
        public final /* synthetic */ boolean $loading;
        public final /* synthetic */ String $mimeType;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $preview;
        public final /* synthetic */ String $sender;
        public final /* synthetic */ String $url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(String str, String str2, String str3, BRg bRg, String str4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str5, Function0<Unit> function0, G0V<? super BFM, ? super Integer, Unit> g0v, int i, int i2, int i3) {
            super(2);
            this.$fileName = str;
            this.$url = str2;
            this.$mimeType = str3;
            this.$modifier = bRg;
            this.$displayTitle = str4;
            this.$deleted = z;
            this.$loading = z2;
            this.$isSlides = z3;
            this.$addBottomPadding = z4;
            this.$addTopPadding = z5;
            this.$sender = str5;
            this.$onClick = function0;
            this.$preview = g0v;
            this.$$changed = i;
            this.$$changed1 = i2;
            this.$$default = i3;
        }

        public final void invoke(BFM bfm, int i) {
            HatchInlineFileChipKt.HatchInlineFileChip(this.$fileName, this.$url, this.$mimeType, this.$modifier, this.$displayTitle, this.$deleted, this.$loading, this.$isSlides, this.$addBottomPadding, this.$addTopPadding, this.$sender, this.$onClick, this.$preview, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.richcontent.HatchInlineFileChipKt$HatchInlineFileChip$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $addBottomPadding;
        public final /* synthetic */ boolean $addTopPadding;
        public final /* synthetic */ boolean $deleted;
        public final /* synthetic */ String $displayTitle;
        public final /* synthetic */ String $fileName;
        public final /* synthetic */ boolean $isSlides;
        public final /* synthetic */ boolean $loading;
        public final /* synthetic */ String $mimeType;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $preview;
        public final /* synthetic */ String $sender;
        public final /* synthetic */ String $url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass6(String str, String str2, String str3, BRg bRg, String str4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str5, Function0<Unit> function0, G0V<? super BFM, ? super Integer, Unit> g0v, int i, int i2, int i3) {
            super(2);
            this.$fileName = str;
            this.$url = str2;
            this.$mimeType = str3;
            this.$modifier = bRg;
            this.$displayTitle = str4;
            this.$deleted = z;
            this.$loading = z2;
            this.$isSlides = z3;
            this.$addBottomPadding = z4;
            this.$addTopPadding = z5;
            this.$sender = str5;
            this.$onClick = function0;
            this.$preview = g0v;
            this.$$changed = i;
            this.$$changed1 = i2;
            this.$$default = i3;
        }

        public final void invoke(BFM bfm, int i) {
            HatchInlineFileChipKt.HatchInlineFileChip(this.$fileName, this.$url, this.$mimeType, this.$modifier, this.$displayTitle, this.$deleted, this.$loading, this.$isSlides, this.$addBottomPadding, this.$addTopPadding, this.$sender, this.$onClick, this.$preview, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void logChipMenuDismiss(HatchScreen hatchScreen, String str, Map<String, String> map) {
        Map<String, String> mapA11 = map;
        HatchInteractionLogger hatchInteractionLogger = HatchInteractionLogger.INSTANCE;
        HatchSurface hatchSurface = HatchSurface.CHAT;
        HatchSubsurface hatchSubsurface = HatchSubsurface.DOT_MENU;
        HatchComponent hatchComponent = HatchComponent.ARTIFACT_OVERFLOW_MENU;
        if (str != null && str.length() != 0) {
            mapA11 = AnonymousClass006.A11(HatchMetadataKey.ARTIFACT_TYPE.getValue(), str, map);
        }
        hatchInteractionLogger.logDismiss(hatchSurface, hatchSubsurface, hatchScreen, hatchComponent, null, mapA11);
    }

    public static final String resolveFileExtension(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        String str3 = "";
        String strA0V = C7BY.A0V(str, ".", "");
        if (strA0V.length() == 0) {
            if (str2 != null) {
                HatchFileUIUtils hatchFileUIUtils = HatchFileUIUtils.INSTANCE;
                String strResolvePreviewPathFromUrl = hatchFileUIUtils.resolvePreviewPathFromUrl(str2);
                if (strResolvePreviewPathFromUrl != null) {
                    str2 = strResolvePreviewPathFromUrl;
                }
                String strFileExtensionForPath = hatchFileUIUtils.fileExtensionForPath(str2);
                if (strFileExtensionForPath != null) {
                    str3 = strFileExtensionForPath;
                }
            }
            strA0V = str3;
        }
        return AnonymousClass001.A0u(strA0V);
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ArtifactShareOption.values().length];
            try {
                AnonymousClass002.A13(ArtifactShareOption.SHARE, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(ArtifactShareOption.PUBLISH_TO_SHARE, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(ArtifactShareOption.PUBLISH, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String artifactTypeForChip(String str, String str2) {
        if ("text/html".equals(str2)) {
            return "canvas";
        }
        String strA0N = C7BY.A0N(str);
        return HatchFileUIUtils.FileExtensions.CODE.contains(strA0N) ? AuraDeeplinkRouteMapper.CODE_PARAM : !HatchFileUIUtils.FileExtensions.HTML.contains(strA0N) ? "document" : "canvas";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long fileIconColor(java.lang.String r2, boolean r3) {
        /*
            if (r3 == 0) goto Ld
            r2 = 4281641043(0xff34a853, double:2.115411747E-314)
        L7:
            r0 = 32
            long r2 = r2 << r0
            long r0 = X.B6A.A01
            return r2
        Ld:
            java.lang.String r1 = "."
            java.lang.String r0 = ""
            java.lang.String r0 = X.C7BY.A0V(r2, r1, r0)
            java.lang.String r1 = X.AnonymousClass001.A0u(r0)
            int r0 = r1.hashCode()
            switch(r0) {
                case 99: goto Lba;
                case 104: goto Lb7;
                case 3304: goto Lb4;
                case 3401: goto Lb1;
                case 3433: goto Lae;
                case 3593: goto Lab;
                case 3632: goto La8;
                case 3649: goto La5;
                case 3669: goto La2;
                case 3711: goto Lc7;
                case 98723: goto L9f;
                case 98819: goto L8d;
                case 98822: goto L7b;
                case 102340: goto L6a;
                case 103649: goto L67;
                case 105441: goto L64;
                case 110834: goto L56;
                case 110968: goto L53;
                case 111145: goto L50;
                case 114276: goto L4d;
                case 115159: goto L4a;
                case 118783: goto L47;
                case 118807: goto L36;
                case 119768: goto L33;
                case 3213227: goto L90;
                case 3254818: goto L2f;
                case 3268712: goto L2c;
                case 3271912: goto L29;
                case 3565914: goto L26;
                case 3645340: goto L6d;
                case 3682393: goto L7e;
                case 3701415: goto L39;
                case 109854227: goto Lbd;
                default: goto L20;
            }
        L20:
            r2 = 4287532691(0xff8e8e93, double:2.118322608E-314)
            goto L7
        L26:
            java.lang.String r0 = "toml"
            goto L3b
        L29:
            java.lang.String r0 = "json"
            goto L3b
        L2c:
            java.lang.String r0 = "jpeg"
            goto L6f
        L2f:
            java.lang.String r0 = "java"
            goto Lbf
        L33:
            java.lang.String r0 = "yml"
            goto L3b
        L36:
            java.lang.String r0 = "xml"
            goto L3b
        L39:
            java.lang.String r0 = "yaml"
        L3b:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L20
            r2 = 4294939904(0xffff9500, double:2.1219822575E-314)
            goto L7
        L47:
            java.lang.String r0 = "xls"
            goto L80
        L4a:
            java.lang.String r0 = "tsv"
            goto L80
        L4d:
            java.lang.String r0 = "svg"
            goto L6f
        L50:
            java.lang.String r0 = "png"
            goto L6f
        L53:
            java.lang.String r0 = "php"
            goto Lbf
        L56:
            java.lang.String r0 = "pdf"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L20
            r2 = 4294916912(0xffff3b30, double:2.121970898E-314)
            goto L7
        L64:
            java.lang.String r0 = "jpg"
            goto L6f
        L67:
            java.lang.String r0 = "htm"
            goto L92
        L6a:
            java.lang.String r0 = "gif"
            goto L6f
        L6d:
            java.lang.String r0 = "webp"
        L6f:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L20
            r2 = 4284139770(0xff5ac8fa, double:2.1166462823E-314)
            goto L7
        L7b:
            java.lang.String r0 = "csv"
            goto L80
        L7e:
            java.lang.String r0 = "xlsx"
        L80:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L20
            r2 = 4281648985(0xff34c759, double:2.115415671E-314)
            goto L7
        L8d:
            java.lang.String r0 = "css"
            goto L92
        L90:
            java.lang.String r0 = "html"
        L92:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L20
            r2 = 4289680094(0xffaf52de, double:2.119383566E-314)
            goto L7
        L9f:
            java.lang.String r0 = "cpp"
            goto Lbf
        La2:
            java.lang.String r0 = "sh"
            goto Lbf
        La5:
            java.lang.String r0 = "rs"
            goto Lbf
        La8:
            java.lang.String r0 = "rb"
            goto Lbf
        Lab:
            java.lang.String r0 = "py"
            goto Lbf
        Lae:
            java.lang.String r0 = "kt"
            goto Lbf
        Lb1:
            java.lang.String r0 = "js"
            goto Lbf
        Lb4:
            java.lang.String r0 = "go"
            goto Lbf
        Lb7:
            java.lang.String r0 = "h"
            goto Lbf
        Lba:
            java.lang.String r0 = "c"
            goto Lbf
        Lbd:
            java.lang.String r0 = "swift"
        Lbf:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto Lcf
            goto L20
        Lc7:
            java.lang.String r0 = "ts"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L20
        Lcf:
            r2 = 4278221567(0xff007aff, double:2.1137223016E-314)
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.richcontent.HatchInlineFileChipKt.fileIconColor(java.lang.String, boolean):long");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0125 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013e A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int fileIconDrawable(java.lang.String r0, boolean r1, java.lang.String r2, java.lang.String r3) {
        /*
            Method dump skipped, instructions count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.richcontent.HatchInlineFileChipKt.fileIconDrawable(java.lang.String, boolean, java.lang.String, java.lang.String):int");
    }

    public static /* synthetic */ int fileIconDrawable$default(String str, boolean z, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        return fileIconDrawable(str, z, str2, str3);
    }

    public static final void logArtifactPanelClick(HatchScreen hatchScreen, String str, String str2, Map<String, String> map) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, HatchSubsurface.MESSAGE_LIST, hatchScreen, HatchComponent.ARTIFACT_PANEL, null, AnonymousClass006.A11("artifact_type", artifactTypeForChip(str, str2), map), null);
    }

    public static final void logChipMenuClick(HatchScreen hatchScreen, Map<String, String> map) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, HatchSubsurface.DOT_MENU, hatchScreen, HatchComponent.ARTIFACT_OVERFLOW_MENU, null, map, null);
    }

    public static final void logChipMenuItemClick(HatchScreen hatchScreen, int i, String str, Map<String, String> map) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, HatchSubsurface.DOT_MENU, hatchScreen, HatchComponent.ARTIFACT_OVERFLOW_MENU_ITEM, null, AGH.A02(map, menuItemMetadata(i, str)), null);
    }

    public static final void logInlineFileChipClick(HatchScreen hatchScreen, Map<String, String> map) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, HatchSubsurface.MESSAGE_LIST, hatchScreen, HatchComponent.INLINE_FILE_CHIP, null, map, null);
    }

    public static final Map<String, String> menuItemMetadata(int i, String str) {
        String str2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "unknown" : HatchDataExportLoggingKt.PHASE_DOWNLOAD : "download_pdf" : "save_to_drive" : "download_html" : "share";
        C0924AIa c0924AIaA0u = C3cG.A0u();
        c0924AIaA0u.put("menu_action", str2);
        if (str != null && str.length() != 0) {
            c0924AIaA0u.put("artifact_type", str);
        }
        return AIW.A0K(c0924AIaA0u);
    }

    public static final void ChipMenuButton(HatchDocumentChipMenuActions hatchDocumentChipMenuActions, String str, boolean z, String str2, BFM bfm, int i) {
        BBI bbiA0M;
        AVy aVyA00;
        int i2;
        String strA0s;
        bfm.AgG(-387534420);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(hatchDocumentChipMenuActions, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0p(bfm, z);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, str2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 1171, 1170), bfm, iA05)) {
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            MutableState mutableState = (MutableState) AnonymousClass005.A0g(bfm, objAaT, obj, false);
            HatchScreen hatchScreenChatScreen = HatchInteractionEnumsKt.chatScreen(AnonymousClass001.A1X(bfm.A6v(LocalIsPrimaryThreadKt.LocalIsPrimaryThread)));
            Map<String, String> mapCurrentChatThreadLogMetadata = CurrentChatThreadLogMetadataKt.currentChatThreadLogMetadata(bfm, 0);
            String str3 = z ? HatchWidgetPresentationKt.HATCH_PRESENTATION_KIND_SLIDES : str2;
            if (hatchDocumentChipMenuActions.onShare != null) {
                bfm.AgE(1241591114);
                aVyA00 = BOf.A00(bfm, R.drawable.arrow_share_wght400_outline_24, 0);
                bbiA0M = C3cG.A07(bfm);
            } else {
                bbiA0M = AnonymousClass002.A0M(bfm, -165309519);
                aVyA00 = null;
            }
            if (hatchDocumentChipMenuActions.onShare == null) {
                bfm.AgE(-165246464);
                BBI.A0R(bbiA0M, false);
                strA0s = null;
            } else {
                bfm.AgE(-165197732);
                int iOrdinal = hatchDocumentChipMenuActions.artifactShareOption.ordinal();
                if (iOrdinal == 0) {
                    bfm.AgE(1241599268);
                    i2 = R.string._name_removed__res_0x7f120b12;
                } else if (iOrdinal == 1) {
                    bfm.AgE(1241603151);
                    i2 = R.string._name_removed__res_0x7f120b10;
                } else {
                    if (iOrdinal != 2) {
                        throw AnonymousClass003.A0k(bfm, bbiA0M, 1241597030);
                    }
                    bfm.AgE(1241606630);
                    strA0s = AnonymousClass001.A0s(bfm, bbiA0M, R.string._name_removed__res_0x7f120b0f);
                    BBI.A0R(bbiA0M, false);
                }
                strA0s = AnonymousClass001.A0s(bfm, bbiA0M, i2);
                BBI.A0R(bbiA0M, false);
            }
            AVy aVyA002 = BOf.A00(bfm, R.drawable.documentformatcode_outline_24_wght400, 0);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120b0d);
            AVy aVyA003 = BOf.A00(bfm, R.drawable.googledrive_filled_24_wght400, 0);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120b11);
            AVy aVyA004 = BOf.A00(bfm, R.drawable.documentformatpdf_outline_24_wght400, 0);
            String strA013 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120b0e);
            AVy aVyA005 = BOf.A00(bfm, R.drawable.arrowdownload_outline_24_wght400, 0);
            String strA014 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120b0c);
            int i3 = iA05 & 14;
            boolean zA1R = AnonymousClass001.A1R(bfm, aVyA005, AnonymousClass005.A1T(bfm, strA013, aVyA004, strA014, AnonymousClass005.A1T(bfm, aVyA002, strA012, aVyA003, AnonymousClass005.A1T(bfm, strA0s, aVyA00, strA01, i3 == 4 || ((iA05 & 8) != 0 && bfm.A65(hatchDocumentChipMenuActions))))));
            Object objAaT2 = bfm.AaT();
            if (zA1R || objAaT2 == obj) {
                AII aiiA17 = AIM.A17();
                if (strA0s != null && aVyA00 != null) {
                    aiiA17.add(new AuraContextMenuItem(0, strA0s, null, aVyA00, null, null, false, false, false, true, false, BRg.A00, 1, 1));
                }
                if (hatchDocumentChipMenuActions.onDownloadAsHtml != null) {
                    aiiA17.add(new AuraContextMenuItem(1, strA01, null, aVyA002, null, null, false, false, false, true, false, BRg.A00, 1, 1));
                }
                if (hatchDocumentChipMenuActions.onSaveToGoogleDrive != null) {
                    aiiA17.add(new AuraContextMenuItem(2, strA012, null, aVyA003, null, null, false, false, false, true, false, BRg.A00, 1, 1));
                }
                if (hatchDocumentChipMenuActions.onDownloadAsPdf != null) {
                    aiiA17.add(new AuraContextMenuItem(3, strA013, null, aVyA004, null, null, false, false, false, true, false, BRg.A00, 1, 1));
                }
                if (hatchDocumentChipMenuActions.onDownload != null) {
                    aiiA17.add(new AuraContextMenuItem(4, strA014, null, aVyA005, null, null, false, false, false, true, false, BRg.A00, 1, 1));
                }
                objAaT2 = AGI.A07(AIM.A18(aiiA17));
                bfm.Ai0(objAaT2);
            }
            AHD ahd = (AHD) objAaT2;
            Alignment alignment = C2VU.A0D;
            BS0 bs0 = BRg.A00;
            InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(alignment, false);
            int iA0D = AnonymousClass001.A0D(bbiA0M);
            AKQ akqA04 = BBI.A04(bbiA0M);
            BRg bRgA01 = AxM.A01(bfm, bs0);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbiA0M.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbiA0M, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA01, akqA04, bRgA01, iA0D);
            AVy aVyA006 = BOf.A00(bfm, R.drawable.meta_ai_icons_ellipsis_regular_cropped, 0);
            String strA0t = AnonymousClass001.A0t(bfm, str, R.string._name_removed__res_0x7f120abf);
            AuraIconButtonSizeV2 auraIconButtonSizeV2 = AuraIconButtonSizeV2.LARGE;
            AuraIconButtonStyle auraIconButtonStyle = AuraIconButtonStyle.SECONDARY;
            AuraIconButtonBackground auraIconButtonBackground = AuraIconButtonBackground.NO_BACKGROUND;
            BRg bRgA0C = C3U4.A0C(bs0, 0.0f, 0.0f, 6.0f, 0.0f);
            int iOrdinal2 = hatchScreenChatScreen.ordinal();
            boolean zA1T = AnonymousClass001.A1T(bfm, mapCurrentChatThreadLogMetadata, bfm.A63(iOrdinal2));
            Object objAaT3 = bfm.AaT();
            if (zA1T || objAaT3 == obj) {
                objAaT3 = new HatchInlineFileChipKt$ChipMenuButton$1$1$1(hatchScreenChatScreen, mapCurrentChatThreadLogMetadata, mutableState);
                bfm.Ai0(objAaT3);
            }
            AuraIconButtonKt.m2552AuraIconButtonV2imgtlEU(bRgA0C, aVyA006, auraIconButtonSizeV2, auraIconButtonStyle, auraIconButtonBackground, null, strA0t, (Function0) objAaT3, null, false, null, null, null, null, bfm, (AVy.$stable << 3) | 28038, 0, 16160);
            boolean zA1S = AnonymousClass004.A1S(bfm, str3, mapCurrentChatThreadLogMetadata, bfm.A63(iOrdinal2)) | (i3 == 4 || ((iA05 & 8) != 0 && bfm.A67(hatchDocumentChipMenuActions)));
            Object objAaT4 = bfm.AaT();
            if (zA1S || objAaT4 == obj) {
                objAaT4 = new HatchInlineFileChipKt$ChipMenuButton$1$2$1(hatchScreenChatScreen, str3, mapCurrentChatThreadLogMetadata, hatchDocumentChipMenuActions, mutableState);
                bfm.Ai0(objAaT4);
            }
            G0U g0u = (G0U) objAaT4;
            boolean zA1S2 = AnonymousClass004.A1S(bfm, str3, mapCurrentChatThreadLogMetadata, bfm.A63(iOrdinal2));
            Object objAaT5 = bfm.AaT();
            if (zA1S2 || objAaT5 == obj) {
                objAaT5 = new HatchInlineFileChipKt$ChipMenuButton$1$3$1(hatchScreenChatScreen, str3, mapCurrentChatThreadLogMetadata, mutableState);
                bfm.Ai0(objAaT5);
            }
            AuraContextMenuKt.m2519AuraContextMenukiaLOpA(null, g0u, (Function0) objAaT5, MutableState.A0A(mutableState), null, (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(4.0f) & 4294967295L), null, false, new HatchInlineFileChipKt$ChipMenuButton$1$4(ahd), false, null, null, null, false, bfm, 196608, 0, 16081);
            BBI.A0R(bbiA0M, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(hatchDocumentChipMenuActions, str, z, str2, i);
        }
    }

    public static final String decodeFileDisplayName(String str) {
        String strDecode = Uri.decode(str);
        return strDecode == null ? str : strDecode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ed  */
    /* JADX WARN: Type inference failed for: r44v4, types: [X.BRg] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HatchInlineFileChip(java.lang.String r79, java.lang.String r80, java.lang.String r81, X.BRg r82, java.lang.String r83, boolean r84, boolean r85, boolean r86, boolean r87, boolean r88, java.lang.String r89, kotlin.jvm.functions.Function0<kotlin.Unit> r90, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r91, X.BFM r92, int r93, int r94, int r95) {
        /*
            Method dump skipped, instructions count: 2251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.richcontent.HatchInlineFileChipKt.HatchInlineFileChip(java.lang.String, java.lang.String, java.lang.String, X.BRg, java.lang.String, boolean, boolean, boolean, boolean, boolean, java.lang.String, kotlin.jvm.functions.Function0, X.G0V, X.BFM, int, int, int):void");
    }
}
