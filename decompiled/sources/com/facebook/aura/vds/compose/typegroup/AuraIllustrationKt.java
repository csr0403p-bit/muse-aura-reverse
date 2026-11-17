package com.facebook.aura.vds.compose.typegroup;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import com.facebook.aura.vds.compose.common.AuraDrawableSource;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class AuraIllustrationKt {

    /* renamed from: com.facebook.aura.vds.compose.typegroup.AuraIllustrationKt$AuraIllustration$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $fillMaxWidth;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ AuraIllustrationSize $size;
        public final /* synthetic */ AuraDrawableSource $source;
        public final /* synthetic */ AuraIllustrationType $type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(BRg bRg, AuraDrawableSource auraDrawableSource, AuraIllustrationSize auraIllustrationSize, boolean z, AuraIllustrationType auraIllustrationType, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$source = auraDrawableSource;
            this.$size = auraIllustrationSize;
            this.$fillMaxWidth = z;
            this.$type = auraIllustrationType;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraIllustrationKt.AuraIllustration(this.$modifier, this.$source, this.$size, this.$fillMaxWidth, this.$type, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AuraIllustrationSize.values().length];
            try {
                AnonymousClass002.A13(AuraIllustrationSize.SIZE_24, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(AuraIllustrationSize.SIZE_32, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(AuraIllustrationSize.SIZE_44, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(AuraIllustrationSize.SIZE_56, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0129  */
    @kotlin.Deprecated(message = "AuraIllustration is deprecated. Use AuraIcon for icon-sized illustrations (SIZE_24, SIZE_32, SIZE_44, SIZE_56) or AuraImage for larger sizes.", replaceWith = @kotlin.ReplaceWith(expression = "AuraIcon or AuraImage", imports = {}))
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AuraIllustration(X.BRg r16, com.facebook.aura.vds.compose.common.AuraDrawableSource r17, com.facebook.aura.vds.compose.typegroup.AuraIllustrationSize r18, boolean r19, com.facebook.aura.vds.compose.typegroup.AuraIllustrationType r20, X.BFM r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.compose.typegroup.AuraIllustrationKt.AuraIllustration(X.BRg, com.facebook.aura.vds.compose.common.AuraDrawableSource, com.facebook.aura.vds.compose.typegroup.AuraIllustrationSize, boolean, com.facebook.aura.vds.compose.typegroup.AuraIllustrationType, X.BFM, int, int):void");
    }
}
