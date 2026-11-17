package com.facebook.aura.conversation.view;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.G0U;
import com.facebook.aura.file.view.api.ContentItem;
import com.facebook.aura.file.view.api.ContentViewerDataHolderKt;
import com.facebook.aura.navigation.AuraNavigator;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchImageOptionPreviewKt$HatchImageOptionPreview$2$1 extends AbstractC7559F3s implements G0U<ImageOptionPreviewExit, Unit> {
    public final /* synthetic */ boolean $isPrimaryThread;
    public final /* synthetic */ int $itemIndex;
    public final /* synthetic */ AHD<ContentItem> $items;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ Function0<Unit> $onClosed;
    public final /* synthetic */ Function0<Unit> $share;
    public final /* synthetic */ Map<String, String> $threadLogMetadata;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ImageOptionPreviewExit imageOptionPreviewExit) {
        int iA0E = AnonymousClass001.A0E(imageOptionPreviewExit, 0);
        if (iA0E == 1) {
            ContentViewerDataHolderKt.navigateToContentViewer(this.$navigator, this.$items, this.$itemIndex, false, false, null, false);
        } else if (iA0E == 2) {
            HatchImageOptionPreviewKt.logImageOptionPreviewShare(this.$isPrimaryThread, this.$threadLogMetadata);
            Function0<Unit> function0 = this.$share;
            if (function0 != null) {
                function0.invoke();
            }
        } else {
            if (iA0E != 0) {
                throw new NoWhenBranchMatchedException();
            }
            HatchImageOptionPreviewKt.logImageOptionPreviewDismiss(this.$isPrimaryThread, this.$threadLogMetadata);
        }
        this.$onClosed.invoke();
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ImageOptionPreviewExit.values().length];
            try {
                AnonymousClass002.A13(ImageOptionPreviewExit.Open, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(ImageOptionPreviewExit.Share, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(ImageOptionPreviewExit.Dismiss, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchImageOptionPreviewKt$HatchImageOptionPreview$2$1(AuraNavigator auraNavigator, AHD<ContentItem> ahd, int i, boolean z, Map<String, String> map, Function0<Unit> function0, Function0<Unit> function02) {
        super(1);
        this.$navigator = auraNavigator;
        this.$items = ahd;
        this.$itemIndex = i;
        this.$isPrimaryThread = z;
        this.$threadLogMetadata = map;
        this.$share = function0;
        this.$onClosed = function02;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(ImageOptionPreviewExit imageOptionPreviewExit) {
        invoke2(imageOptionPreviewExit);
        return Unit.INSTANCE;
    }
}
