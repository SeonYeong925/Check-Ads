package project.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import project.domain.*;

@Component
public class ConsultingHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Consulting>> {

    @Override
    public EntityModel<Consulting> process(EntityModel<Consulting> model) {
        return model;
    }
}
