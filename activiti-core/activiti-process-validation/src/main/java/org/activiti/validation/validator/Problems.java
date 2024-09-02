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

package org.activiti.validation.validator;

public interface Problems {

  String ALL_PROCESS_DEFINITIONS_NOT_EXECUTABLE = "ALL_PROCESS_DEFINITIONS_NOT_EXECUTABLE";
  String PROCESS_DEFINITION_NOT_EXECUTABLE = "PROCESS_DEFINITION_NOT_EXECUTABLE";
  String ASSOCIATION_INVALID_SOURCE_REFERENCE = "ASSOCIATION_INVALID_SOURCE_REFERENCE";
  String ASSOCIATION_INVALID_TARGET_REFERENCE = "ASSOCIATION_INVALID_TARGET_REFERENCE";
  String EXECUTION_LISTENER_IMPLEMENTATION_MISSING = "EXECUTION_LISTENER_IMPLEMENTATION_MISSING";
  String EXECUTION_LISTENER_INVALID_IMPLEMENTATION_TYPE = "EXECUTION_LISTENER_INVALID_IMPLEMENTATION_TYPE";
  String EVENT_LISTENER_IMPLEMENTATION_MISSING = "EVENT_LISTENER_IMPLEMENTATION_MISSING";
  String EVENT_LISTENER_INVALID_IMPLEMENTATION = "EVENT_LISTENER_INVALID_IMPLEMENTATION";
  String EVENT_LISTENER_INVALID_THROW_EVENT_TYPE = "EVENT_LISTENER_INVALID_THROW_EVENT_TYPE";
  String START_EVENT_MULTIPLE_FOUND = "START_EVENT_MULTIPLE_FOUND";
  String START_EVENT_INVALID_EVENT_DEFINITION = "START_EVENT_INVALID_EVENT_DEFINITION";
  String SEQ_FLOW_INVALID_SRC = "SEQ_FLOW_INVALID_SRC";
  String SEQ_FLOW_INVALID_TARGET = "SEQ_FLOW_INVALID_TARGET";
  String SEQ_FLOW_INVALID_TARGET_DIFFERENT_SCOPE = "SEQ_FLOW_INVALID_TARGET_DIFFERENT_SCOPE";
  String SEQ_FLOW_INVALID_CONDITIONAL_EXPRESSION = "SEQ_FLOW_INVALID_CONDITIONAL_EXPRESSION";
  String USER_TASK_LISTENER_IMPLEMENTATION_MISSING = "USER_TASK_LISTENER_IMPLEMENTATION_MISSING";
  String SERVICE_TASK_INVALID_TYPE = "SERVICE_TASK_INVALID_TYPE";
  String SERVICE_TASK_RESULT_VAR_NAME_WITH_DELEGATE = "SERVICE_TASK_RESULT_VAR_NAME_WITH_DELEGATE";
  String SERVICE_TASK_MISSING_IMPLEMENTATION = "SERVICE_TASK_MISSING_IMPLEMENTATION";
  String SERVICE_TASK_WEBSERVICE_INVALID_OPERATION_REF = "SERVICE_TASK_WEBSERVICE_INVALID_OPERATION_REF";
  String SEND_TASK_INVALID_IMPLEMENTATION = "SEND_TASK_INVALID_IMPLEMENTATION";
  String SEND_TASK_INVALID_TYPE = "SEND_TASK_INVALID_TYPE";
  String SEND_TASK_WEBSERVICE_INVALID_OPERATION_REF = "SEND_TASK_WEBSERVICE_INVALID_OPERATION_REF";
  String SCRIPT_TASK_MISSING_SCRIPT = "SCRIPT_TASK_MISSING_SCRIPT";
  String MAIL_TASK_NO_RECIPIENT = "MAIL_TASK_NO_RECIPIENT";
  String MAIL_TASK_NO_CONTENT = "MAIL_TASK_NO_CONTENT";
  String SHELL_TASK_NO_COMMAND = "SHELL_TASK_NO_COMMAND";
  String SHELL_TASK_INVALID_PARAM = "SHELL_TASK_INVALID_PARAM";
  String DMN_TASK_NO_KEY = "DMN_TASK_NO_KEY";
  String EXCLUSIVE_GATEWAY_NO_OUTGOING_SEQ_FLOW = "EXCLUSIVE_GATEWAY_NO_OUTGOING_SEQ_FLOW";
  String EXCLUSIVE_GATEWAY_CONDITION_NOT_ALLOWED_ON_SINGLE_SEQ_FLOW = "EXCLUSIVE_GATEWAY_CONDITION_NOT_ALLOWED_ON_SINGLE_SEQ_FLOW";
  String EXCLUSIVE_GATEWAY_CONDITION_ON_DEFAULT_SEQ_FLOW = "EXCLUSIVE_GATEWAY_CONDITION_ON_DEFAULT_SEQ_FLOW";
  String EXCLUSIVE_GATEWAY_SEQ_FLOW_WITHOUT_CONDITIONS = "EXCLUSIVE_GATEWAY_SEQ_FLOW_WITHOUT_CONDITIONS";
  String EVENT_GATEWAY_ONLY_CONNECTED_TO_INTERMEDIATE_EVENTS = "EVENT_GATEWAY_ONLY_CONNECTED_TO_INTERMEDIATE_EVENTS";
  String BPMN_MODEL_TARGET_NAMESPACE_TOO_LONG = "BPMN_MODEL_TARGET_NAMESPACE_TOO_LONG";
  String PROCESS_DEFINITION_ID_NOT_UNIQUE = "PROCESS_DEFINITION_ID_NOT_UNIQUE";
  String PROCESS_DEFINITION_ID_TOO_LONG = "PROCESS_DEFINITION_ID_TOO_LONG";
  String PROCESS_DEFINITION_NAME_TOO_LONG = "PROCESS_DEFINITION_NAME_TOO_LONG";
  String PROCESS_DEFINITION_DOCUMENTATION_TOO_LONG = "PROCESS_DEFINITION_DOCUMENTATION_TOO_LONG";
  String FLOW_ELEMENT_ID_TOO_LONG = "FLOW_ELEMENT_ID_TOO_LONG";
  String SUBPROCESS_MULTIPLE_START_EVENTS = "SUBPROCESS_MULTIPLE_START_EVENTS";
  String SUBPROCESS_START_EVENT_EVENT_DEFINITION_NOT_ALLOWED = "SUBPROCESS_START_EVENT_EVENT_DEFINITION_NOT_ALLOWED";
  String EVENT_SUBPROCESS_INVALID_START_EVENT_DEFINITION = "EVENT_SUBPROCESS_INVALID_START_EVENT_DEFINITION";
  String BOUNDARY_EVENT_NO_EVENT_DEFINITION = "BOUNDARY_EVENT_NO_EVENT_DEFINITION";
  String BOUNDARY_EVENT_INVALID_EVENT_DEFINITION = "BOUNDARY_EVENT_INVALID_EVENT_DEFINITION";
  String BOUNDARY_EVENT_CANCEL_ONLY_ON_TRANSACTION = "BOUNDARY_EVENT_CANCEL_ONLY_ON_TRANSACTION";
  String BOUNDARY_EVENT_MULTIPLE_CANCEL_ON_TRANSACTION = "BOUNDARY_EVENT_MULTIPLE_CANCEL_ON_TRANSACTION";
  String INTERMEDIATE_CATCH_EVENT_NO_EVENTDEFINITION = "INTERMEDIATE_CATCH_EVENT_NO_EVENTDEFINITION";
  String INTERMEDIATE_CATCH_EVENT_INVALID_EVENTDEFINITION = "INTERMEDIATE_CATCH_EVENT_INVALID_EVENTDEFINITION";
  String ERROR_MISSING_ERROR_CODE = "ERROR_MISSING_ERROR_CODE";
  String EVENT_TIMER_MISSING_CONFIGURATION = "EVENT_TIMER_MISSING_CONFIGURATION";
  String THROW_EVENT_INVALID_EVENTDEFINITION = "THROW_EVENT_INVALID_EVENTDEFINITION";
  String MULTI_INSTANCE_MISSING_COLLECTION = "MULTI_INSTANCE_MISSING_COLLECTION";
  String MESSAGE_INVALID_ITEM_REF = "MESSAGE_INVALID_ITEM_REF";
  String MESSAGE_EVENT_MISSING_MESSAGE_REF = "MESSAGE_EVENT_MISSING_MESSAGE_REF";
  String MESSAGE_EVENT_INVALID_MESSAGE_REF = "MESSAGE_EVENT_INVALID_MESSAGE_REF";
  String MESSAGE_EVENT_MULTIPLE_ON_BOUNDARY_SAME_MESSAGE_ID = "MESSAGE_EVENT_MULTIPLE_ON_BOUNDARY_SAME_MESSAGE_ID";
  String OPERATION_INVALID_IN_MESSAGE_REFERENCE = "OPERATION_INVALID_IN_MESSAGE_REFERENCE";
  String SIGNAL_EVENT_MISSING_SIGNAL_REF = "SIGNAL_EVENT_MISSING_SIGNAL_REF";
  String SIGNAL_EVENT_INVALID_SIGNAL_REF = "SIGNAL_EVENT_INVALID_SIGNAL_REF";
  String COMPENSATE_EVENT_INVALID_ACTIVITY_REF = "COMPENSATE_EVENT_INVALID_ACTIVITY_REF";
  String COMPENSATE_EVENT_MULTIPLE_ON_BOUNDARY = "COMPENSATE_EVENT_MULTIPLE_ON_BOUNDARY";
  String SIGNAL_MISSING_ID = "SIGNAL_MISSING_ID";
  String SIGNAL_MISSING_NAME = "SIGNAL_MISSING_NAME";
  String SIGNAL_DUPLICATE_NAME = "SIGNAL_DUPLICATE_NAME";
  String SIGNAL_INVALID_SCOPE = "SIGNAL_INVALID_SCOPE";
  String DATA_ASSOCIATION_MISSING_TARGETREF = "DATA_ASSOCIATION_MISSING_TARGETREF";
  String DATA_OBJECT_MISSING_NAME = "DATA_OBJECT_MISSING_NAME";
  String END_EVENT_CANCEL_ONLY_INSIDE_TRANSACTION = "END_EVENT_CANCEL_ONLY_INSIDE_TRANSACTION";
  String DI_INVALID_REFERENCE = "DI_INVALID_REFERENCE";
  String DI_DOES_NOT_REFERENCE_FLOWNODE = "DI_DOES_NOT_REFERENCE_FLOWNODE";
  String DI_DOES_NOT_REFERENCE_SEQ_FLOW = "DI_DOES_NOT_REFERENCE_SEQ_FLOW";
  String FLOW_ELEMENT_ASYNC_NOT_AVAILABLE = "FLOW_ELEMENT_ASYNC_NOT_AVAILABLE";
  String EVENT_TIMER_ASYNC_NOT_AVAILABLE = "EVENT_TIMER_ASYNC_NOT_AVAILABLE";
  String SIGNAL_ASYNC_NOT_AVAILABLE = "SIGNAL_ASYNC_NOT_AVAILABLE";
}
