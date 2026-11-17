package com.facebook.aura.partners.voice.avatar;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.bugreport.AuraBugReportSender;
import java.io.File;
import java.io.IOException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.partners.voice.avatar.HatchAvatarIdlePosterCache$prepare$2", f = "HatchAvatarIdlePosterCache.kt", l = {116, 116}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchAvatarIdlePosterCache$prepare$2 extends AbstractC07127nr implements G0V<File, HtJ<? super HatchAvatarIdlePoster>, Object> {
    public final /* synthetic */ String $videoUri;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ HatchAvatarIdlePosterCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAvatarIdlePosterCache$prepare$2(HatchAvatarIdlePosterCache hatchAvatarIdlePosterCache, String str, HtJ<? super HatchAvatarIdlePosterCache$prepare$2> htJ) {
        super(2, htJ);
        this.this$0 = hatchAvatarIdlePosterCache;
        this.$videoUri = str;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        HatchAvatarIdlePosterCache$prepare$2 hatchAvatarIdlePosterCache$prepare$2 = new HatchAvatarIdlePosterCache$prepare$2(this.this$0, this.$videoUri, htJ);
        hatchAvatarIdlePosterCache$prepare$2.L$0 = obj;
        return hatchAvatarIdlePosterCache$prepare$2;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) throws IOException {
        HatchAvatarIdlePoster poster;
        HatchAvatarIdlePosterCache hatchAvatarIdlePosterCache;
        File fileCreateTempFile;
        File file = (File) this.L$0;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        try {
            if (i == 0) {
                Hwg.A00(obj);
                poster = this.this$0.readPoster(file);
                if (poster == null) {
                    hatchAvatarIdlePosterCache = this.this$0;
                    String str = this.$videoUri;
                    fileCreateTempFile = File.createTempFile("idle", AuraBugReportSender.DEFAULT_VIDEO_EXTENSION, file.getParentFile());
                    C7384Etj.A0X(fileCreateTempFile);
                    this.L$0 = file;
                    this.L$1 = hatchAvatarIdlePosterCache;
                    this.L$2 = fileCreateTempFile;
                    this.label = 1;
                    obj = hatchAvatarIdlePosterCache.download(str, fileCreateTempFile, this);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                }
                return poster;
            }
            if (i != 1) {
                if (i != 2) {
                    throw AnonymousClass001.A0n();
                }
                fileCreateTempFile = (File) this.L$2;
                Hwg.A00(obj);
                poster = (HatchAvatarIdlePoster) obj;
                return poster;
            }
            fileCreateTempFile = (File) this.L$2;
            hatchAvatarIdlePosterCache = (HatchAvatarIdlePosterCache) this.L$1;
            Hwg.A00(obj);
            if (!AnonymousClass001.A1X(obj)) {
                poster = null;
                return poster;
            }
            C7384Etj.A0X(fileCreateTempFile);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = fileCreateTempFile;
            this.label = 2;
            obj = hatchAvatarIdlePosterCache.extractPoster(fileCreateTempFile, file, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
            poster = (HatchAvatarIdlePoster) obj;
            return poster;
        } finally {
            fileCreateTempFile.delete();
        }
    }

    @Override // X.G0V
    public final Object invoke(File file, HtJ<? super HatchAvatarIdlePoster> htJ) {
        return ((HatchAvatarIdlePosterCache$prepare$2) create(file, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
