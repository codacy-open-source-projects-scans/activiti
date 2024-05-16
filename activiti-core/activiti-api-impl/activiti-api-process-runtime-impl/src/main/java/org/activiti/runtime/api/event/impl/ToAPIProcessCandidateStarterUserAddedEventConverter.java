/*
 * Copyright 2010-2020 Alfresco Software, Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.activiti.runtime.api.event.impl;

import org.activiti.api.process.runtime.events.ProcessCandidateStarterUserAddedEvent;
import org.activiti.api.runtime.event.impl.ProcessCandidateStarterUserAddedEventImpl;
import org.activiti.engine.delegate.event.ActivitiEntityEvent;
import org.activiti.engine.task.IdentityLink;
import org.activiti.runtime.api.model.impl.APIProcessCandidateStarterUserConverter;

import java.util.Optional;

public class ToAPIProcessCandidateStarterUserAddedEventConverter implements EventConverter<ProcessCandidateStarterUserAddedEvent, ActivitiEntityEvent> {

    private APIProcessCandidateStarterUserConverter converter;
    private ProcessCandidateStarterEventConverterHelper processCandidateStarterEventConverterHelper = new ProcessCandidateStarterEventConverterHelper();

    public ToAPIProcessCandidateStarterUserAddedEventConverter(APIProcessCandidateStarterUserConverter converter) {
        this.converter = converter;
    }

    @Override
    public Optional<ProcessCandidateStarterUserAddedEvent> from(ActivitiEntityEvent internalEvent) {
        ProcessCandidateStarterUserAddedEventImpl event = null;
        if (internalEvent.getEntity() instanceof IdentityLink) {
            IdentityLink identityLink = (IdentityLink) internalEvent.getEntity();
            if (processCandidateStarterEventConverterHelper.isProcessCandidateStarterUserLink(identityLink)) {
                event = new ProcessCandidateStarterUserAddedEventImpl(converter.from(identityLink));
            }
        }
        return Optional.ofNullable(event);
    }

}
