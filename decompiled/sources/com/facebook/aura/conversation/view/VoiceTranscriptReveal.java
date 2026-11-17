package com.facebook.aura.conversation.view;

import X.A6B;
import X.AGE;
import X.AGF;
import X.AbstractC07127nr;
import X.AbstractC0885AGm;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AvW;
import X.C00s;
import X.C06827l3;
import X.C06847l8;
import X.C0881AGi;
import X.C1Lu;
import X.C3pU;
import X.C6v3;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.F60;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.os.SystemClock;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableLongState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class VoiceTranscriptReveal {
    public final C00s frameTimeMs$delegate;
    public final MutableState text$delegate;
    public final MutableState words$delegate;

    /* renamed from: com.facebook.aura.conversation.view.VoiceTranscriptReveal$animate$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements Function0<List<? extends VoiceTranscriptWord>> {
        public AnonymousClass2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ List<? extends VoiceTranscriptWord> invoke() {
            return VoiceTranscriptReveal.this.getWords();
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends VoiceTranscriptWord> invoke() {
            return VoiceTranscriptReveal.this.getWords();
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.view.VoiceTranscriptReveal$animate$3", f = "HatchStreamingUserMessageText.kt", l = {128}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.view.VoiceTranscriptReveal$animate$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<List<? extends VoiceTranscriptWord>, HtJ<? super Unit>, Object> {
        public long J$0;
        public /* synthetic */ Object L$0;
        public int label;

        /* renamed from: com.facebook.aura.conversation.view.VoiceTranscriptReveal$animate$3$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<Long, Unit> {
            public final /* synthetic */ VoiceTranscriptReveal this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(VoiceTranscriptReveal voiceTranscriptReveal) {
                super(1);
                this.this$0 = voiceTranscriptReveal;
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Unit invoke(Long l) {
                invoke(l.longValue());
                return Unit.INSTANCE;
            }

            public final void invoke(long j) {
                this.this$0.setFrameTimeMs(SystemClock.uptimeMillis());
            }
        }

        public AnonymousClass3(HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass3 anonymousClass3 = VoiceTranscriptReveal.this.new AnonymousClass3(htJ);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(List<? extends VoiceTranscriptWord> list, HtJ<? super Unit> htJ) {
            return invoke2((List<VoiceTranscriptWord>) list, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Long l;
            long jLongValue;
            List list = (List) this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    Long l2 = new Long(((VoiceTranscriptWord) it.next()).appearedAtMs + 300);
                    loop1: while (true) {
                        l = l2;
                        while (it.hasNext()) {
                            l2 = new Long(((VoiceTranscriptWord) it.next()).appearedAtMs + 300);
                            if (l.compareTo(l2) < 0) {
                                break;
                            }
                        }
                    }
                    jLongValue = l.longValue();
                } else {
                    jLongValue = 0;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                jLongValue = this.J$0;
                Hwg.A00(obj);
            }
            while (VoiceTranscriptReveal.this.frameTimeMs$delegate.AHH() < jLongValue) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(VoiceTranscriptReveal.this);
                this.L$0 = null;
                this.J$0 = jLongValue;
                this.label = 1;
                if (AvW.A01(anonymousClass1, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<VoiceTranscriptWord> list, HtJ<? super Unit> htJ) {
            return ((AnonymousClass3) create(list, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final void update(String str) {
        C7384Etj.A0Y(str, 0);
        if (str.equals(MutableState.A05(this.text$delegate))) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        setWords(wordsFor(str, jUptimeMillis));
        setText(str);
        setFrameTimeMs(jUptimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setFrameTimeMs(long j) {
        this.frameTimeMs$delegate.Adh(j);
    }

    private final void setText(String str) {
        this.text$delegate.Af8(str);
    }

    private final void setWords(List<VoiceTranscriptWord> list) {
        this.words$delegate.Af8(list);
    }

    public final Object animate(HtJ<? super Unit> htJ) {
        Object objA00 = C3pU.A00(htJ, new AnonymousClass3(null), C6v3.A01(new AnonymousClass2()));
        return objA00 != EnumC10460Hji.A02 ? Unit.INSTANCE : objA00;
    }

    public final long getFrameTimeMs() {
        return this.frameTimeMs$delegate.AHH();
    }

    public final String getText() {
        return MutableState.A05(this.text$delegate);
    }

    public final List<VoiceTranscriptWord> getWords() {
        return (List) this.words$delegate.getValue();
    }

    public VoiceTranscriptReveal() {
        AGE ageA01 = AGF.A01();
        this.text$delegate = new ParcelableSnapshotMutableState(ageA01, "");
        this.words$delegate = new ParcelableSnapshotMutableState(ageA01, C0881AGi.A00);
        this.frameTimeMs$delegate = new ParcelableSnapshotMutableLongState(0L);
    }

    private final List<VoiceTranscriptWord> wordsFor(String str, long j) {
        long j2;
        VoiceTranscriptWord voiceTranscriptWord;
        List<VoiceTranscriptWord> words = getWords();
        int i = 0;
        List listA02 = A6B.A02(C06827l3.A00(str, HatchStreamingUserMessageTextKt.TRANSCRIPT_WORD));
        int i2 = 0;
        while (i2 < Math.min(words.size(), listA02.size())) {
            String str2 = words.get(i2).text;
            String strGroup = ((C06847l8) ((C1Lu) listA02.get(i2))).A01.group();
            C7384Etj.A0U(strGroup);
            if (!strGroup.equals(str2)) {
                break;
            }
            i2++;
        }
        int i3 = 0;
        while (i3 < Math.min(words.size(), listA02.size()) - i2) {
            String str3 = words.get((words.size() - 1) - i3).text;
            String strGroup2 = ((C06847l8) ((C1Lu) listA02.get((listA02.size() - 1) - i3))).A01.group();
            C7384Etj.A0U(strGroup2);
            if (!strGroup2.equals(str3)) {
                break;
            }
            i3++;
        }
        ArrayList arrayListA0i = AnonymousClass003.A0i(listA02);
        for (Object obj : listA02) {
            int i4 = i + 1;
            if (i < 0) {
                AbstractC0885AGm.A14();
                throw F60.createAndThrow();
            }
            C1Lu c1Lu = (C1Lu) obj;
            if (i < i2) {
                voiceTranscriptWord = words.get(i);
            } else if (i >= listA02.size() - i3) {
                voiceTranscriptWord = words.get((words.size() - listA02.size()) + i);
            } else {
                long j3 = (i - i2) * 18;
                if (j3 > 120) {
                    j3 = 120;
                }
                j2 = j + j3;
                String strGroup3 = ((C06847l8) c1Lu).A01.group();
                C7384Etj.A0U(strGroup3);
                arrayListA0i.add(new VoiceTranscriptWord(strGroup3, c1Lu.AJM().A00, c1Lu.AJM().A01 + 1, j2));
                i = i4;
            }
            j2 = voiceTranscriptWord.appearedAtMs;
            String strGroup32 = ((C06847l8) c1Lu).A01.group();
            C7384Etj.A0U(strGroup32);
            arrayListA0i.add(new VoiceTranscriptWord(strGroup32, c1Lu.AJM().A00, c1Lu.AJM().A01 + 1, j2));
            i = i4;
        }
        return arrayListA0i;
    }
}
