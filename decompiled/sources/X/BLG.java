package X;

import com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository;

/* loaded from: classes4.dex */
public interface BLG<T> extends C1BN<T>, C3Em<T> {
    /* JADX WARN: Multi-variable type inference failed */
    static boolean A00(BLG blg) {
        Object value = blg.getValue();
        VoiceSelectionRepository.OperationState operationState = (VoiceSelectionRepository.OperationState) value;
        return blg.A6e(value, new VoiceSelectionRepository.OperationState(operationState.renamingSavedVoiceId, operationState.deletingSavedVoiceId, null, operationState.revision + 1, operationState.selectionFailureRevision, operationState.failure));
    }

    boolean A6e(T t, T t2);

    void Af8(T t);

    @Override // X.C1BN
    T getValue();
}
