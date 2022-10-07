package em.profile.application;

import em.profile.domain.Profile;
import em.profile.infrastructure.ProfileRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileService {
    private ProfileRepository profileRepository;

    public ProfileService(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    public Profile getProfile(Long id) {
        return profileRepository.findById(id).get();
    }

    public void create(Profile profile) {
        profileRepository.save(profile);
    }

    public List<Profile> getProfiles() {
        return profileRepository.findAll();
    }

    public void update(Long id, Profile profile) {
        profile.setId(id);

        profileRepository.save(profile);
    }

    public void delete(Profile profile) {
        profileRepository.delete(profile);
    }

}
