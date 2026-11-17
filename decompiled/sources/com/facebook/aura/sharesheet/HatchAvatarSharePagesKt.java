package com.facebook.aura.sharesheet;

import X.AGI;
import X.AHD;
import X.AbstractC0878AGe;
import X.AbstractC0885AGm;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C0881AGi;
import X.C10571Hud;
import X.C7384Etj;
import X.CFK;
import X.F60;
import X.FGI;
import X.G0V;
import X.HsJ;
import android.net.Uri;
import com.facebook.aura.components.musicattribution.MusicAttribution;
import com.facebook.aura.gateway.AuraMarkdownUrlResolversKt;
import com.facebook.aura.gateway.AvatarMediaUrlsKt;
import com.facebook.aura.identity.dances.HatchAvatarDance;
import com.facebook.aura.model.AiIdentity;
import com.facebook.aura.model.AvatarMedia;
import com.facebook.aura.model.AvatarMediaSelectionKt;
import com.facebook.aura.model.AvatarVideoVariant;
import com.facebook.aura.model.HatchAttachmentAudio;
import com.facebook.aura.model.HatchDanceShare;
import com.facebook.aura.model.SelectedAvatarMedia;
import com.facebook.aura.sharesheet.AvatarSharePage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class HatchAvatarSharePagesKt {
    public static final String TAG = "HatchAvatarSharePages";

    /* renamed from: com.facebook.aura.sharesheet.HatchAvatarSharePagesKt$avatarSharePages$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<Integer, HatchAvatarDance, AvatarSharePage.Dance> {
        public final /* synthetic */ AbstractC3358CGz $userSession;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AbstractC3358CGz abstractC3358CGz) {
            super(2);
            this.$userSession = abstractC3358CGz;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ AvatarSharePage.Dance invoke(Integer num, HatchAvatarDance hatchAvatarDance) {
            return invoke(AnonymousClass001.A0F(num), hatchAvatarDance);
        }

        public final AvatarSharePage.Dance invoke(int i, HatchAvatarDance hatchAvatarDance) {
            C7384Etj.A0Y(hatchAvatarDance, 1);
            return HatchAvatarSharePagesKt.toSharePage(hatchAvatarDance, this.$userSession);
        }
    }

    public static final AvatarSharePages avatarSharePages(AiIdentity aiIdentity, List<HatchAvatarDance> list, boolean z, AbstractC3358CGz abstractC3358CGz) {
        AnonymousClass002.A1B(list, 1, abstractC3358CGz);
        return new AvatarSharePages(mapEachOrSkip(list, new AnonymousClass1(abstractC3358CGz)), mapEachOrSkip(statusVideoUrls(aiIdentity, z, abstractC3358CGz), AnonymousClass2.INSTANCE));
    }

    /* renamed from: com.facebook.aura.sharesheet.HatchAvatarSharePagesKt$avatarSharePages$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<Integer, String, AvatarSharePage.Intro> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(2);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ AvatarSharePage.Intro invoke(Integer num, String str) {
            return invoke(AnonymousClass001.A0F(num), str);
        }

        public final AvatarSharePage.Intro invoke(int i, String str) {
            C7384Etj.A0Y(str, 1);
            return new AvatarSharePage.Intro(Uri.parse(str), HatchAvatarSharePagesKt.paletteAt(i));
        }
    }

    public static final <T, P extends AvatarSharePage> AHD<P> mapEachOrSkip(List<? extends T> list, G0V<? super Integer, ? super T, ? extends P> g0v) {
        P c10571Hud;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (T t : list) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC0885AGm.A14();
                throw F60.createAndThrow();
            }
            try {
                c10571Hud = g0v.invoke(Integer.valueOf(i), t);
            } catch (Throwable th) {
                c10571Hud = new C10571Hud(th);
            }
            Throwable thA00 = HsJ.A00(c10571Hud);
            if (thA00 != null) {
                CFK.A06(TAG, FGI.A0M("Skipping avatar share page: ", thA00.getMessage()));
            }
            if (!(c10571Hud instanceof C10571Hud) && c10571Hud != null) {
                arrayList.add(c10571Hud);
            }
            i = i2;
        }
        return AGI.A07(arrayList);
    }

    public static final HatchAvatarStoryPalette paletteAt(int i) {
        AHD<HatchAvatarStoryPalette> ahd = HatchAvatarStoryKt.HatchAvatarStoryPalettes;
        return (HatchAvatarStoryPalette) ahd.get(i % ahd.size());
    }

    public static final List<String> statusVideoUrls(AiIdentity aiIdentity, boolean z, AbstractC3358CGz abstractC3358CGz) {
        AvatarMedia avatarMedia;
        if (aiIdentity != null && (avatarMedia = aiIdentity.avatarMedia) != null) {
            SelectedAvatarMedia selectedAvatarMediaSelect = AvatarMediaSelectionKt.select(avatarMedia, z);
            List listAsList = Arrays.asList(AvatarVideoVariant.IDLE, AvatarVideoVariant.WORKING, AvatarVideoVariant.MAKING_SOMETHING, AvatarVideoVariant.MILESTONE_ACHIEVEMENT, AvatarVideoVariant.MILESTONE_LEVEL_UP, AvatarVideoVariant.WAITING_FOR_SUBAGENTS, AvatarVideoVariant.CONNECTING);
            ArrayList arrayList = new ArrayList();
            Iterator it = listAsList.iterator();
            while (it.hasNext()) {
                String strVideoUrl = AvatarMediaUrlsKt.videoUrl(selectedAvatarMediaSelect, (AvatarVideoVariant) it.next(), abstractC3358CGz);
                if (strVideoUrl != null) {
                    arrayList.add(strVideoUrl);
                }
            }
            List<String> listA0X = AbstractC0878AGe.A0X(AbstractC0878AGe.A0f(arrayList));
            if (listA0X != null) {
                return listA0X;
            }
        }
        return C0881AGi.A00;
    }

    public static final MusicAttribution toMusicAttribution(HatchAttachmentAudio hatchAttachmentAudio) {
        String str = hatchAttachmentAudio.title;
        if (str != null) {
            return new MusicAttribution(str, hatchAttachmentAudio.artist, hatchAttachmentAudio.coverArtUrl);
        }
        return null;
    }

    public static final AvatarSharePage.Dance toSharePage(HatchAvatarDance hatchAvatarDance, AbstractC3358CGz abstractC3358CGz) {
        Uri uri = Uri.parse(AuraMarkdownUrlResolversKt.resolveAttachmentRawUrl(hatchAvatarDance.video, abstractC3358CGz));
        String str = (String) AbstractC0878AGe.A0G(AuraMarkdownUrlResolversKt.resolveAuraMarkdownVideoThumbnails(hatchAvatarDance.video.path, abstractC3358CGz));
        Uri uri2 = str != null ? Uri.parse(str) : null;
        HatchAttachmentAudio hatchAttachmentAudio = hatchAvatarDance.video.audio;
        return new AvatarSharePage.Dance(uri, uri2, hatchAttachmentAudio != null ? toMusicAttribution(hatchAttachmentAudio) : null, new HatchDanceShare(hatchAvatarDance.video.audio));
    }
}
