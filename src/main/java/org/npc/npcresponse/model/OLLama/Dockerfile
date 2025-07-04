# OLLAMA MODEL

FROM ollama/ollama:0.9.5

RUN apt-get update && apt-get install -y curl

ENV OLLAMA_MODEL="llama2"

ENV NVIDIA_VISIBLE_DEVICES=all
ENV NVIDIA_DRIVER_CAPABILITIES=compute,utility

ENTRYPOINT ["/bin/sh", "-c"]
CMD ["ollama serve & while ! curl -s http://localhost:11434/api/tags; do sleep 1; done && ollama pull ${OLLAMA_MODEL} && wait"]