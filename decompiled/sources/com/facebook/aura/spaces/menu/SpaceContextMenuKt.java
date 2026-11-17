package com.facebook.aura.spaces.menu;

import X.AnonymousClass002;
import com.facebook.aura.model.SpaceConstructionStatus;
import com.facebook.aura.utils.HatchUtil;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public abstract class SpaceContextMenuKt {
    public static final int SPACE_MENU_ADD_SHORTCUT = 1;
    public static final int SPACE_MENU_ADD_WIDGET = 12;
    public static final int SPACE_MENU_AUDIENCE = 11;
    public static final int SPACE_MENU_CHANGE_ICON = 5;
    public static final int SPACE_MENU_DELETE = 2;
    public static final int SPACE_MENU_DIVIDER = 9;
    public static final int SPACE_MENU_DOWNLOAD = 4;
    public static final int SPACE_MENU_INVITE = 10;
    public static final int SPACE_MENU_MOVE_TO_LIBRARY = 6;
    public static final int SPACE_MENU_MOVE_TO_SPACES = 7;
    public static final int SPACE_MENU_PIN = 3;
    public static final int SPACE_MENU_RENAME = 8;
    public static final int SPACE_MENU_SHARE = 0;

    public static final boolean hasBuiltExport(SpaceConstructionStatus spaceConstructionStatus) {
        int iOrdinal;
        if (spaceConstructionStatus == null) {
            iOrdinal = -1;
        } else {
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            iOrdinal = spaceConstructionStatus.ordinal();
        }
        boolean z = true;
        if (iOrdinal != -1 && iOrdinal != 2 && iOrdinal != 1) {
            z = false;
            if (iOrdinal != 0 && iOrdinal != 3 && iOrdinal != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.library.repo.UnifiedArtifact rememberSpaceCatalogEntry(java.lang.String r10, X.BFM r11, int r12) {
        /*
            r0 = 0
            X.C7384Etj.A0Y(r10, r0)
            X.CGz r1 = X.AnonymousClass002.A0h(r11)
            boolean r0 = r11.A65(r1)
            java.lang.Object r4 = r11.AaT()
            if (r0 != 0) goto L16
            java.lang.Object r0 = X.C78N.A00
            if (r4 != r0) goto L1f
        L16:
            com.facebook.aura.library.repo.UnifiedArtifactsRepository$Companion r0 = com.facebook.aura.library.repo.UnifiedArtifactsRepository.Companion
            com.facebook.aura.library.repo.UnifiedArtifactsRepository r4 = r0.getInstance(r1)
            r11.Ai0(r4)
        L1f:
            com.facebook.aura.library.repo.UnifiedArtifactsRepository r4 = (com.facebook.aura.library.repo.UnifiedArtifactsRepository) r4
            X.1BN<X.AHD<com.facebook.aura.library.repo.UnifiedArtifact>> r0 = r4.items
            r3 = 0
            X.1BO r9 = X.C2CK.A02(r11, r0)
            java.lang.Object r0 = r9.getValue()
            boolean r8 = r11.A65(r0)
            r0 = r12 & 14
            r7 = r0 ^ 6
            r6 = 0
            r5 = 4
            if (r7 <= r5) goto L3e
            boolean r0 = r11.A65(r10)
            if (r0 != 0) goto L43
        L3e:
            r1 = r12 & 6
            r0 = 0
            if (r1 != r5) goto L44
        L43:
            r0 = 1
        L44:
            r8 = r8 | r0
            java.lang.Object r2 = r11.AaT()
            if (r8 != 0) goto L4f
            java.lang.Object r0 = X.C78N.A00
            if (r2 != r0) goto L5c
        L4f:
            java.lang.Object r0 = r9.getValue()
            java.util.List r0 = (java.util.List) r0
            com.facebook.aura.library.repo.UnifiedArtifact r2 = com.facebook.aura.library.repo.UnifiedArtifactKt.findSpaceBySlug(r0, r10)
            r11.Ai0(r2)
        L5c:
            com.facebook.aura.library.repo.UnifiedArtifact r2 = (com.facebook.aura.library.repo.UnifiedArtifact) r2
            boolean r1 = X.AnonymousClass003.A1M(r11, r2, r4)
            if (r7 <= r5) goto L6a
            boolean r0 = r11.A65(r10)
            if (r0 != 0) goto L6e
        L6a:
            r0 = r12 & 6
            if (r0 != r5) goto L6f
        L6e:
            r6 = 1
        L6f:
            r1 = r1 | r6
            java.lang.Object r0 = r11.AaT()
            if (r1 != 0) goto L7a
            java.lang.Object r1 = X.C78N.A00
            if (r0 != r1) goto L82
        L7a:
            com.facebook.aura.spaces.menu.SpaceContextMenuKt$rememberSpaceCatalogEntry$resolved$2$1 r0 = new com.facebook.aura.spaces.menu.SpaceContextMenuKt$rememberSpaceCatalogEntry$resolved$2$1
            r0.<init>(r2, r4, r10, r3)
            r11.Ai0(r0)
        L82:
            X.G0V r0 = (X.G0V) r0
            androidx.compose.runtime.MutableState r0 = X.C3UV.A00(r11, r2, r10, r2, r0)
            java.lang.Object r0 = r0.getValue()
            com.facebook.aura.library.repo.UnifiedArtifact r0 = (com.facebook.aura.library.repo.UnifiedArtifact) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spaces.menu.SpaceContextMenuKt.rememberSpaceCatalogEntry(java.lang.String, X.BFM, int):com.facebook.aura.library.repo.UnifiedArtifact");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean rememberSpaceIsPinned(java.lang.String r11, X.BFM r12, int r13) {
        /*
            r0 = 0
            X.C7384Etj.A0Y(r11, r0)
            X.CGz r1 = X.AnonymousClass002.A0h(r12)
            boolean r0 = r12.A65(r1)
            java.lang.Object r5 = r12.AaT()
            if (r0 != 0) goto L16
            java.lang.Object r0 = X.C78N.A00
            if (r5 != r0) goto L1f
        L16:
            com.facebook.aura.library.repo.UnifiedArtifactsRepository$Companion r0 = com.facebook.aura.library.repo.UnifiedArtifactsRepository.Companion
            com.facebook.aura.library.repo.UnifiedArtifactsRepository r5 = r0.getInstance(r1)
            r12.Ai0(r5)
        L1f:
            com.facebook.aura.library.repo.UnifiedArtifactsRepository r5 = (com.facebook.aura.library.repo.UnifiedArtifactsRepository) r5
            X.1BN<X.AHD<com.facebook.aura.library.repo.UnifiedArtifact>> r0 = r5.items
            r4 = 0
            X.1BO r10 = X.C2CK.A02(r12, r0)
            java.lang.Object r0 = r10.getValue()
            boolean r2 = r12.A65(r0)
            r0 = r13 & 14
            r7 = r0 ^ 6
            r9 = 1
            r8 = 0
            r6 = 4
            if (r7 <= r6) goto L3f
            boolean r0 = r12.A65(r11)
            if (r0 != 0) goto L44
        L3f:
            r1 = r13 & 6
            r0 = 0
            if (r1 != r6) goto L45
        L44:
            r0 = 1
        L45:
            r2 = r2 | r0
            java.lang.Object r3 = r12.AaT()
            if (r2 != 0) goto L50
            java.lang.Object r0 = X.C78N.A00
            if (r3 != r0) goto L5d
        L50:
            java.lang.Object r0 = r10.getValue()
            java.util.List r0 = (java.util.List) r0
            com.facebook.aura.library.repo.UnifiedArtifact r3 = com.facebook.aura.library.repo.UnifiedArtifactKt.findSpaceBySlug(r0, r11)
            r12.Ai0(r3)
        L5d:
            com.facebook.aura.library.repo.UnifiedArtifact r3 = (com.facebook.aura.library.repo.UnifiedArtifact) r3
            if (r3 == 0) goto L9e
            boolean r0 = r3.isPinned
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
        L67:
            boolean r1 = X.AnonymousClass003.A1M(r12, r3, r5)
            if (r7 <= r6) goto L73
            boolean r0 = r12.A65(r11)
            if (r0 != 0) goto L78
        L73:
            r0 = r13 & 6
            if (r0 == r6) goto L78
            r9 = 0
        L78:
            r1 = r1 | r9
            java.lang.Object r0 = r12.AaT()
            if (r1 != 0) goto L83
            java.lang.Object r1 = X.C78N.A00
            if (r0 != r1) goto L8b
        L83:
            com.facebook.aura.spaces.menu.SpaceContextMenuKt$rememberSpaceIsPinned$resolved$2$1 r0 = new com.facebook.aura.spaces.menu.SpaceContextMenuKt$rememberSpaceIsPinned$resolved$2$1
            r0.<init>(r3, r5, r11, r4)
            r12.Ai0(r0)
        L8b:
            X.G0V r0 = (X.G0V) r0
            androidx.compose.runtime.MutableState r0 = X.C3UV.A00(r12, r2, r11, r3, r0)
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L9d
            boolean r8 = r0.booleanValue()
        L9d:
            return r8
        L9e:
            r2 = r4
            goto L67
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spaces.menu.SpaceContextMenuKt.rememberSpaceIsPinned(java.lang.String, X.BFM, int):boolean");
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SpaceConstructionStatus.values().length];
            try {
                AnonymousClass002.A13(SpaceConstructionStatus.SUCCEEDED, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(SpaceConstructionStatus.UPDATING, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(SpaceConstructionStatus.CONSTRUCTING, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(SpaceConstructionStatus.FAILED, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(SpaceConstructionStatus.INTERRUPTED, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean shouldShowDownload(boolean z, SpaceConstructionStatus spaceConstructionStatus) {
        return z && hasBuiltExport(spaceConstructionStatus);
    }

    public static final boolean shouldShowShare(boolean z) {
        return z && HatchUtil.INSTANCE.isArtifactSharingEnabled();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.library.repo.ArtifactItem rememberSpaceNavItem(java.lang.String r5, X.BFM r6, int r7) {
        /*
            X.CGz r2 = X.AnonymousClass002.A0h(r6)
            boolean r0 = r6.A65(r2)
            java.lang.Object r1 = r6.AaT()
            if (r0 != 0) goto L12
            java.lang.Object r0 = X.C78N.A00
            if (r1 != r0) goto L16
        L12:
            com.facebook.aura.library.repo.ArtifactsDataSource r1 = X.AnonymousClass003.A0a(r6, r2)
        L16:
            com.facebook.aura.library.repo.ArtifactsDataSource r1 = (com.facebook.aura.library.repo.ArtifactsDataSource) r1
            X.1BN<X.AHD<com.facebook.aura.library.repo.ArtifactItem>> r0 = r1.items
            X.1BO r4 = X.C2CK.A02(r6, r0)
            java.lang.Object r0 = r4.getValue()
            boolean r3 = r6.A65(r0)
            r0 = r7 & 14
            r0 = r0 ^ 6
            r2 = 4
            if (r0 <= r2) goto L33
            boolean r0 = r6.A65(r5)
            if (r0 != 0) goto L38
        L33:
            r0 = r7 & 6
            r1 = 0
            if (r0 != r2) goto L39
        L38:
            r1 = 1
        L39:
            r1 = r1 | r3
            java.lang.Object r0 = r6.AaT()
            if (r1 != 0) goto L44
            java.lang.Object r1 = X.C78N.A00
            if (r0 != r1) goto L53
        L44:
            if (r5 == 0) goto L56
            java.lang.Object r0 = r4.getValue()
            java.util.List r0 = (java.util.List) r0
            com.facebook.aura.library.repo.ArtifactItem r0 = com.facebook.aura.library.repo.ArtifactItemKt.findSpaceBySlug(r0, r5)
        L50:
            r6.Ai0(r0)
        L53:
            com.facebook.aura.library.repo.ArtifactItem r0 = (com.facebook.aura.library.repo.ArtifactItem) r0
            return r0
        L56:
            r0 = 0
            goto L50
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spaces.menu.SpaceContextMenuKt.rememberSpaceNavItem(java.lang.String, X.BFM, int):com.facebook.aura.library.repo.ArtifactItem");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x056d  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x05da  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x05e7  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0616  */
    /* JADX WARN: Removed duplicated region for block: B:266:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b1 A[PHI: r0 r13
  0x00b1: PHI (r0v19 int) = (r0v18 int), (r0v88 int) binds: [B:30:0x00a4, B:33:0x00aa] A[DONT_GENERATE, DONT_INLINE]
  0x00b1: PHI (r13v1 int) = (r13v0 int), (r13v5 int) binds: [B:30:0x00a4, B:33:0x00aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c3 A[PHI: r0 r12
  0x00c3: PHI (r0v21 int) = (r0v20 int), (r0v85 int) binds: [B:36:0x00b6, B:39:0x00bc] A[DONT_GENERATE, DONT_INLINE]
  0x00c3: PHI (r12v1 int) = (r12v0 int), (r12v15 int) binds: [B:36:0x00b6, B:39:0x00bc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fe A[PHI: r2
  0x00fe: PHI (r2v2 int) = (r2v1 int), (r2v20 int) binds: [B:60:0x00f2, B:63:0x00f8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010d A[PHI: r1
  0x010d: PHI (r1v3 int) = (r1v2 int), (r1v89 int) binds: [B:66:0x0101, B:69:0x0107] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0120 A[PHI: r0
  0x0120: PHI (r0v45 int) = (r0v44 int), (r0v78 int) binds: [B:72:0x0114, B:75:0x011a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0133 A[PHI: r0
  0x0133: PHI (r0v48 int) = (r0v47 int), (r0v75 int) binds: [B:78:0x0127, B:81:0x012d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x015c  */
    /* renamed from: SpaceContextMenu-xDtEYtk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2179SpaceContextMenuxDtEYtk(java.lang.String r85, java.lang.String r86, boolean r87, kotlin.jvm.functions.Function0<kotlin.Unit> r88, kotlin.jvm.functions.Function0<kotlin.Unit> r89, X.BRg r90, boolean r91, boolean r92, kotlin.jvm.functions.Function0<kotlin.Unit> r93, boolean r94, boolean r95, boolean r96, boolean r97, java.lang.Integer r98, com.facebook.aura.model.SpaceConstructionStatus r99, java.lang.String r100, boolean r101, kotlin.jvm.functions.Function0<kotlin.Unit> r102, kotlin.jvm.functions.Function0<kotlin.Unit> r103, kotlin.jvm.functions.Function0<kotlin.Unit> r104, kotlin.jvm.functions.Function0<kotlin.Unit> r105, com.facebook.aura.spaces.menu.SpaceContextMenuMode r106, long r107, com.facebook.aura.spaces.menu.SpaceMenuLogOrigin r109, X.BFM r110, int r111, int r112, int r113, int r114) {
        /*
            Method dump skipped, instructions count: 1591
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spaces.menu.SpaceContextMenuKt.m2179SpaceContextMenuxDtEYtk(java.lang.String, java.lang.String, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.BRg, boolean, boolean, kotlin.jvm.functions.Function0, boolean, boolean, boolean, boolean, java.lang.Integer, com.facebook.aura.model.SpaceConstructionStatus, java.lang.String, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, com.facebook.aura.spaces.menu.SpaceContextMenuMode, long, com.facebook.aura.spaces.menu.SpaceMenuLogOrigin, X.BFM, int, int, int, int):void");
    }
}
